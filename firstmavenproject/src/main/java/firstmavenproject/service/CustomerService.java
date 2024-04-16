package firstmavenproject.service;

import java.util.List;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.exception.OperationNotExecutedException;
import firstmavenproject.model.Customer;

public interface CustomerService {
	//Create
	public String addCustomer(Customer customer);
	//Retrieve By custId
	public Optional<Customer> getCustomerById(Integer customerId) throws CustomerNotFoundException;
	//Update Customer
	public String updateCustomer(Customer customer);
	//Delete Customer
	public Optional<String> deleteCustomer(Integer customerId) throws CustomerNotFoundException;
	
	//Retrieve all customer
	public List<Customer> getAllCustomer() throws CustomerNotFoundException;
	
	//Retrieve By customer name
	public Optional<Customer> getCustomerByName(String customerName) throws CustomerNotFoundException;
	
	//Using stored procedure
	public String addCustomerUsingSP(Customer customer) throws OperationNotExecutedException;
}
