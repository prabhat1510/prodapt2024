package firstmavenproject.ui;

import java.time.LocalDate;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.model.Customer;
import firstmavenproject.service.CustomerService;
import firstmavenproject.service.CustomerServiceImpl;

public class MainDemo {

	public static void main(String[] args) {
		//Insert record
		/**
		Customer customer1 = new Customer(3,"Aishwarya",
				LocalDate.of(1982, 10, 15),9999213333L,"aishwarya@gmail.com");
		CustomerService service = new CustomerServiceImpl();
		String message = service.addCustomer(customer1);
		System.out.println(message);**/
		//Delete record
		CustomerService service = new CustomerServiceImpl();
		Optional<String> message = Optional.empty();
		try {
			message = service.deleteCustomer(4);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(message.isPresent()) {
			System.out.println(message.get());
		}
		
		//Retrieve customer by id 
		try {
			Optional<Customer> cust = service.getCustomerById(2);
			if(cust.isPresent()) {
				System.out.println(cust.get());
			}
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
