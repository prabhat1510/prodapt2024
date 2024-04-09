package classworkdayfifteen.methodreferenceexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		System.out.println("***********************List of order streams example******************");
		Order order1 = new Order("AUD", 15000.50);
		Order order2 = new Order("INR", 5000.65);
		Order order3 = new Order("USD", 150000.45);
		Order order4 = new Order("EUR", 25000.25);
		Order order5 = new Order("AUD", 8000.11);
		Order order6 = new Order("EUR", 50000.75);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		
		System.out.println(orderList);
		System.out.println("*******************Sort Using Custom Comparator***************************");
		Collections.sort(orderList,new AmountComparator());
		orderList.forEach(System.out::println);
		System.out.println("*******************Sort Using Method Reference***************************");
		Collections.sort(orderList,Comparator.comparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		System.out.println("*******************Sort Using Lambda***************************");
		Collections.sort(orderList,Comparator.comparing(o->o.getCurrency()));
		orderList.forEach(System.out::println);
		
		System.out.println("*******************Sort Using Method Reference***************************");
		Collections.sort(orderList,Comparator.comparingDouble(Order::getAmount));
		orderList.forEach(System.out::println);
	}

}
