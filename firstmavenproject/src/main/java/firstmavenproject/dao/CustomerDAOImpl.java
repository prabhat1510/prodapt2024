package firstmavenproject.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.exception.OperationNotExecutedException;
import firstmavenproject.model.Customer;
import firstmavenproject.util.DBConnectionUtil;
import firstmavenproject.util.QUERYMAPPER;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public String addCustomer(Customer customer) {
		int row = 0;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {
			// Creating a connection object using Driver Manager getConnection method
			// conn = DriverManager.getConnection(QUERYMAPPER.URL, QUERYMAPPER.USERNAME,
			// QUERYMAPPER.PASSWORD);
			conn = DBConnectionUtil.getDBConnection();
			// Preparing statement to execute -- JDBC Statements
			preparedStatement = conn.prepareStatement(QUERYMAPPER.ADD_CUSTOMER);

			// Setting data into the sql statement using JDBC PreparedStatement Interface
			// set methods
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());

			// Execute the statement
			row = preparedStatement.executeUpdate();
			// Close the resources
			conn.close();
			preparedStatement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (row != 0) {
			return QUERYMAPPER.RECORD_INSERTED_SUCCESSFULLY;
		} else {
			return QUERYMAPPER.UNABLE_TO_INSERT_A_RECORD;
		}
	}

	@Override
	public Optional<Customer> getCustomerById(Integer customerId) throws CustomerNotFoundException {

		Customer customer = new Customer();
		try (Connection conn = DBConnectionUtil.getDBConnection();
			// JDBC statement is created
			PreparedStatement preparedStatement = conn.prepareStatement(QUERYMAPPER.GET_CUSTOMER_BY_ID);) {

			preparedStatement.setInt(1, customerId);

			// Statement is executed and it returns ResultSet
			ResultSet rs = preparedStatement.executeQuery();
			// Retrieve Customer object data from ResulSet
			if (rs.next()) {
				// Setting data from resultset to domain object in application
				customer.setCustomerId(rs.getInt(1));// getting the value using column index
				customer.setCustomerName(rs.getString("customerName"));
				customer.setEmail(rs.getString("email"));// getting the value using column name
				customer.setMobile(rs.getLong("mobile"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());// getting the value using column index
			}
			// Closing the resources
			// conn.close();
			// preparedStatement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Optional.of(customer);
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteCustomer(Integer customerId) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		int row = 0;
		try {
			// conn = DriverManager.getConnection(QUERYMAPPER.URL, QUERYMAPPER.USERNAME,
			// QUERYMAPPER.PASSWORD);
			conn = DBConnectionUtil.getDBConnection();
			// Preparing statement to execute
			preparedStatement = conn.prepareStatement(QUERYMAPPER.DELETE_CUSTOMER);

			// Setting data into the sql statement using JDBC PreparedStatement Interface
			// set methods
			preparedStatement.setInt(1, customerId);
			row = preparedStatement.executeUpdate();
			conn.close();
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (row != 0) {
			return Optional.of(QUERYMAPPER.RECORD_DELETED_SUCCESSFULLY);
		} else {
			return Optional.of(QUERYMAPPER.UNABLE_TO_DELETE_A_RECORD);
		}
	}

	@Override
	public List<Customer> getAllCustomer() throws CustomerNotFoundException {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = null;
		Statement stmt = null;
		// Get a connection object
		conn = DBConnectionUtil.getDBConnection();
		try {
			// Create a Statement
			stmt = conn.createStatement();
			// Execute a statement
			ResultSet resultSet = stmt.executeQuery(QUERYMAPPER.GET_ALL_CUSTOMERS);
			// Process the resultset
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setEmail(resultSet.getString("email"));
				customer.setMobile(resultSet.getLong("mobile"));
				customer.setBirthDate(resultSet.getDate(3).toLocalDate());

				customerList.add(customer);
			}
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public Optional<Customer> getCustomerByName(String customerName) throws CustomerNotFoundException {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		conn = DBConnectionUtil.getDBConnection();
		Customer customer = new Customer();
		try {
			// JDBC statement is created
			preparedStatement = conn.prepareStatement(QUERYMAPPER.GET_CUSTOMER_BY_ID);
			preparedStatement.setString(1, customerName);

			// Statement is executed and it returns ResultSet
			ResultSet rs = preparedStatement.executeQuery();
			// Retrieve Customer object data from ResulSet
			if (rs.next()) {
				// Setting data from resultset to domain object in application
				customer.setCustomerId(rs.getInt(1));// getting the value using column index
				customer.setCustomerName(rs.getString("customerName"));
				customer.setEmail(rs.getString("email"));// getting the value using column name
				customer.setMobile(rs.getLong("mobile"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());// getting the value using column index
			}
			// Closing the resources
			conn.close();
			preparedStatement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Optional.of(customer);
	}
	
	public String addCustomerUsingSP(Customer customer) throws OperationNotExecutedException{
		int row =0;
		try {
			CallableStatement cstmt = DBConnectionUtil.getDBConnection().prepareCall("{call add_customer(?,?,?,?,?)}");
			cstmt.setInt(1, customer.getCustomerId());
			cstmt.setString(2, customer.getCustomerName());
			cstmt.setDate(3, Date.valueOf(customer.getBirthDate()));
			cstmt.setLong(4, customer.getMobile());
			cstmt.setString(5, customer.getEmail());
			//success = cstmt.execute();//execute() method was returning false after executing stored procedure successfully
			row = cstmt.executeUpdate();
		}catch(SQLTimeoutException ste) {
			ste.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row !=0) {
			return "Stored Procedure executed succefully";
		}else {
			throw new OperationNotExecutedException("Stored Procedure execution gave error");
		}
	}

}
