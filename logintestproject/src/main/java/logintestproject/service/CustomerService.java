package logintestproject.service;

import logintestproject.exceptions.CustomerNotFoundException;
import logintestproject.model.Customer;

public interface CustomerService {
	
	public String addCustomer(Customer customer);
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;
}
