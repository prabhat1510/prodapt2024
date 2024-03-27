package layeredarchitectureexample.service;

import layeredarchitectureexample.exceptions.CustomerNotFoundException;
import layeredarchitectureexample.model.Customer;

public interface CustomerService {
	// Create
	public String addCustomer(Customer customer);

	// Retrieve
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;

	// Update
	public String updateCustomer(Customer customer);

	// Delete
	public String deleteCustomerById(Integer custId);
}
