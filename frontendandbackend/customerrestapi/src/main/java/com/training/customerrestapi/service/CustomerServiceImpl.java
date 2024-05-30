package com.training.customerrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.customerrestapi.entities.Customer;
import com.training.customerrestapi.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;
	@Override
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}
	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}
	@Override
	public Customer getCustomerById(Integer id) {
		Optional<Customer> cust = repo.findById(id);
		if(cust.isPresent()) {
			return cust.get();
		}else {
			return null;
		}
	}
	@Override
	public Customer updateCustomer(Integer id, Customer customer) {
		if(repo.findById(id).isPresent()) {
			customer.setId(id);
			return repo.save(customer);
		}else {
		return null;
		}
	}
	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}

}
