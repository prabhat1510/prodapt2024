package com.training.customerrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.customerrestapi.entities.Customer;
import com.training.customerrestapi.service.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	@PostMapping("/user")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	@GetMapping("/user")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}
	
	@GetMapping("/user/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		return service.getCustomerById(id);
	}
	
	@PutMapping("/user/{id}")
	public Customer updateCustomer(@PathVariable("id") Integer id,@RequestBody Customer customer) {
		return service.updateCustomer(id,customer);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
			service.deleteById(id);
	}
}
