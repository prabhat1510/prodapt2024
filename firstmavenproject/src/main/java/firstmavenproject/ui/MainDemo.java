package firstmavenproject.ui;

import java.time.LocalDate;

import firstmavenproject.model.Customer;
import firstmavenproject.service.CustomerService;
import firstmavenproject.service.CustomerServiceImpl;

public class MainDemo {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Anushka Sharma",
				LocalDate.of(1991, 12, 14),9999113311L,"asharma@gmail.com");
		CustomerService service = new CustomerServiceImpl();
		String message = service.addCustomer(customer1);
		System.out.println(message);
	}

}
