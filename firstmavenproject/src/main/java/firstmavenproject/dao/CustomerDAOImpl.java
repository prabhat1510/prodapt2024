package firstmavenproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String URL = "jdbc:mysql://localhost:3306/prodapt2024";
	@Override
	public String addCustomer(Customer customer) {
		int row =0;
		try {
			//Creating a connection object using Driver Manager getConnection method
			Connection conn = DriverManager.getConnection(URL, "root", "password");
			
			//Preparing statement to execute
			PreparedStatement preparedStatement = conn.
					prepareStatement("INSERT INTO CUSTOMER(customerId,customerName,birthDate,mobile,email) "
							+ "VALUES(?,?,?,?,?)");
			
			//Setting data into the sql statement using JDBC PreparedStatement Interface set methods
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());
			
			row = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(row !=0) {
			return "Record inserted successfully";
		}else {
			return "Unable to insert a record";
		}
	}

	@Override
	public Optional<Customer> getCustomerById(Integer customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteCustomer(Integer customerId) {
		Connection conn;
		int row = 0;
		try {
			conn = DriverManager.getConnection(URL, "root", "password");
			//Preparing statement to execute
			PreparedStatement preparedStatement = conn.
					prepareStatement("DELETE FROM CUSTOMER WHERE customerId=? ");
			
			//Setting data into the sql statement using JDBC PreparedStatement Interface set methods
			preparedStatement.setInt(1, customerId);
			 row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(row !=0) {
			return Optional.of("Record deleted successfully");
		}else {
			return Optional.of("Unable to delete a record");
		}
	}

}
