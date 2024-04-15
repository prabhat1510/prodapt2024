package classworkdayseventeen.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperationsExample {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Raj",Arrays.asList("9999910111","9899910551"));
		Customer customer2 = new Customer(2,"Raju",Arrays.asList("9879910111","9888910551"));
		Customer customer3 = new Customer(3,"Rajesh",Arrays.asList("9999910111","9899910551"));
		Customer customer4 = new Customer(4,"Rajni",Arrays.asList("9888810111"));
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		
		List<List<String>> listOfPhones = customers.stream()
					.map(cust->cust.getPhones())
					.collect(Collectors.toList());
		System.out.println(listOfPhones);
		
		
		List<String> listOfPhone= customers.stream()
				.map(cust->cust.getPhones())//This will return stream of phone numbers
				.flatMap(phones->phones.stream().map(phone->"+91- "+phone))//Here flatMap flatten the phones 
				.collect(Collectors.toList());
		
		System.out.println(listOfPhone);
	}

}
