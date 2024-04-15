package firstmavenproject.dao;

import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.model.Customer;

public interface CustomerDAO {
	//Create
	public String addCustomer(Customer customer);
	//Retrieve By custId
	public Optional<Customer> getCustomerById(Integer customerId) throws CustomerNotFoundException;
	//Update Customer
	public String updateCustomer(Customer customer);
	//Delete Customer
	public Optional<String> deleteCustomer(Integer customerId) throws CustomerNotFoundException;
}
