package com.training.customerrestapi.service;

import java.util.List;

import com.training.customerrestapi.entities.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Customer getCustomerById(Integer id);
	public Customer updateCustomer(Integer id,Customer customer);
	public void deleteById(Integer id);
}
