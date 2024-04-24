package logintestproject.dao;

import logintestproject.exceptions.CustomerNotFoundException;
import logintestproject.model.Customer;

public interface CustomerDAO {
	
	public String addCustomer(Customer customer);
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;
}
