package classworkdayfifteen.methodreferenceexample.usecase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class MainApp {

	public static void main(String[] args) {
		Address add1 = new Address(1, 14, "Ram Lane", "New Delhi", "Delhi", "India");
		Address add2 = new Address(2, 15, "Shyam Lane", "New York", "New York", "USA");
		Address add3 = new Address(3, 16, "Triplicane Car Street", "Chennai", "TamilNadu", "India");
		Address add4 = new Address(4, 17, "Kanagam Road", "Chennai", "TamilNadu", "India");

		BillDetails bill1 = new BillDetails(11, LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 15), 1500.00, add1);
		BillDetails bill2 = new BillDetails(12, LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 2500.00, add1);
		BillDetails bill3 = new BillDetails(13, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 3, 15), 501.00, add2);
		BillDetails bill4 = new BillDetails(14, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15), 4500.00, add2);
		BillDetails bill5 = new BillDetails(15, LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 15), 3500.00, add2);
		BillDetails bill6 = new BillDetails(16, LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 15), 1550.00, add1);
		BillDetails bill7 = new BillDetails(17, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 15), 2550.00, add1);
		BillDetails bill8 = new BillDetails(18, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 15), 2501.00, add2);
		BillDetails bill9 = new BillDetails(19, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 15), 2555.00, add1);
		BillDetails bill10 = new BillDetails(20, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 15), 1510.00, add1);

		BillDetails bill11 = new BillDetails(21, LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 15), 8500.00, add3);
		BillDetails bill12 = new BillDetails(22, LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 7500.00, add3);
		BillDetails bill13 = new BillDetails(23, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 3, 15), 6501.00, add3);
		BillDetails bill14 = new BillDetails(24, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15), 9500.00, add3);
		BillDetails bill15 = new BillDetails(25, LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 15), 520.00, add4);
		BillDetails bill16 = new BillDetails(26, LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 551.00, add4);
		BillDetails bill17 = new BillDetails(27, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 2, 15), 450.00, add4);
		BillDetails bill18 = new BillDetails(28, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15), 511.00, add4);

		List<BillDetails> billCust1 = new ArrayList<BillDetails>();
		billCust1.add(bill1);
		billCust1.add(bill2);
		billCust1.add(bill6);
		billCust1.add(bill7);
		billCust1.add(bill9);
		billCust1.add(bill10);

		List<BillDetails> billCust2 = new ArrayList<BillDetails>();
		billCust2.add(bill3);
		billCust2.add(bill4);
		billCust2.add(bill5);
		billCust2.add(bill8);

		List<BillDetails> billCust3 = new ArrayList<BillDetails>();
		billCust3.add(bill11);
		billCust3.add(bill12);
		billCust3.add(bill13);
		billCust3.add(bill14);
		List<BillDetails> billCust4 = new ArrayList<BillDetails>();
		billCust4.add(bill15);
		billCust4.add(bill16);
		billCust4.add(bill17);
		billCust4.add(bill18);

		Customer cust1 = new Customer(1, "Rishidhar", billCust1);
		Customer cust2 = new Customer(2, "Amritha", billCust2);
		Customer cust3 = new Customer(3, "Nataraj", billCust3);
		Customer cust4 = new Customer(4, "RajLakshmi", billCust4);

		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		/**
		 * 1. Sort Customer on the basis of name 2. Get Customer Bills and display it on
		 * the basis of amount Higher amount bill has to be displayed at first and so on
		 * 3. Find Customers who has got bills more than 5000 and display customer and
		 * bills with more than 5000
		 */

		System.out.println("***********************Sort Customer on the basis of name***************************");
		Collections.sort(customerList, Comparator.comparing(Customer::getCustName));
		customerList.forEach(System.out::println);
		System.out.println("*******************Q2***************************");

		System.out.println("*******************Q3***************************");
		Map<Integer, List<BillDetails>> customerWithBillMoreThan100 = new HashMap<Integer, List<BillDetails>>();
		Predicate<BillDetails> predicate = x -> x.getAmount() > 1000;

		for (Customer c : customerList) {
			List<BillDetails> listOfBills = new ArrayList<BillDetails>();
			for (BillDetails bill : c.getBillDetails()) {

				if (predicate.test(bill)) {
					listOfBills.add(bill);
				}

			}
			customerWithBillMoreThan100.put(c.getCustId(), listOfBills);
		}

		BiConsumer<Integer, List<BillDetails>> biCons = 
				(k, v) -> System.out.println("Key : " + k + ", Value : " + v);
		customerWithBillMoreThan100.forEach(biCons);
	}
}