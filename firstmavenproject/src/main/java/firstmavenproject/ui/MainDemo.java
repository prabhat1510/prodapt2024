package firstmavenproject.ui;

import java.util.List;
import java.util.Optional;

import firstmavenproject.exception.CustomerNotFoundException;
import firstmavenproject.model.Customer;
import firstmavenproject.service.CustomerService;
import firstmavenproject.service.CustomerServiceImpl;

public class MainDemo {

	public static void main(String[] args) {
		// Insert record
		System.out.println("**************************Insert customer************************************");
		/**
		 * Customer customer1 = new Customer(3,"Aishwarya", LocalDate.of(1982, 10,
		 * 15),9999213333L,"aishwarya@gmail.com"); CustomerService service = new
		 * CustomerServiceImpl(); String message = service.addCustomer(customer1);
		 * System.out.println(message);
		 **/
		// Delete record
		System.out.println("**************************Delete record by id ************************************");
		CustomerService service = new CustomerServiceImpl();
		Optional<String> message = Optional.empty();
		try {
			message = service.deleteCustomer(4);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (message.isPresent()) {
			System.out.println(message.get());
		}

		System.out.println("**************************Retrieve customer by id************************************");
		// Retrieve customer by id
		try {
			Optional<Customer> cust = service.getCustomerById(2);
			if (cust.isPresent()) {
				System.out.println(cust.get());
			}
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Retrieve customer by name
		System.out.println("**************************Retrieve customer by name************************************");
		try {
			Optional<Customer> cust = service.getCustomerByName("Aishwarya");
			if (cust.isPresent()) {
				System.out.println(cust.get());
			}
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Retrieve all customers
		System.out.println("**************************Retrieve all customers************************************");
		List<Customer> customerList = null;
		try {
			customerList = service.getAllCustomer();
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(customerList);
	}

}
