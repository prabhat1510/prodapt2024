package firstmavenproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
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
			return "Record inserted successfully";
		} else {
			return "Unable to insert a record";
		}
	}

	@Override
	public Optional<Customer> getCustomerById(Integer customerId) throws CustomerNotFoundException {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		conn = DBConnectionUtil.getDBConnection();
		Customer customer = new Customer();
		try {
			preparedStatement = conn.prepareStatement("SELECT * FROM CUSTOMER WHERE customerId=?");
			preparedStatement.setInt(1, customerId);

			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				// Setting data from resultset to domain object in application
				customer.setCustomerId(rs.getInt(1));//getting the value using column index
				customer.setCustomerName(rs.getString("customerName"));
				customer.setEmail(rs.getString("email"));//getting the value using column name
				customer.setMobile(rs.getLong("mobile"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());//getting the value using column index
			}
			conn.close();
			preparedStatement.close();
			
			
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
			return Optional.of("Record deleted successfully");
		} else {
			return Optional.of("Unable to delete a record");
		}
	}

}
