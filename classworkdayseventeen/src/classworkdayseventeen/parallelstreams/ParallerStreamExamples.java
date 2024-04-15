package classworkdayseventeen.parallelstreams;

import java.util.ArrayList;
import java.util.List;


public class ParallerStreamExamples {

	public static void main(String[] args) {
		System.out.println("***********************Objects example in stream ************************************");
		Order orderOne = new Order("AUD", 15000.00);
		Order orderTwo = new Order("INR", 5000.00);
		Order orderThree = new Order("USD", 150000.00);
		Order orderFour = new Order("EUR", 5000.00);
		Order orderFive = new Order("AUD", 8000.00);
		Order orderSix = new Order("EUR", 5001.00);
		Order orderSeven = new Order("EUR", 1000.00);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		orderList.add(orderSeven);

		double totalAmount = orderList.parallelStream().filter(o->o.getCurrency().equals("EUR"))
													    .mapToDouble(Order::getAmount)
													    .sum();
		
		System.out.println(totalAmount);
	}

}
