package classworkdayfourteen.functionalinterface.predicateexample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OrderPredicateExample {

	public static void main(String[] args) {
		Order order1 = new Order(1l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 8), "NEW");
		Order order2 = new Order(2l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 5), "NEW");
		Order order3 = new Order(3l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 18), "DELIVERED");
		Order order4 = new Order(4l, LocalDate.of(2021, 3, 22), LocalDate.of(2021, 3, 27), "PENDING");
		Order order5 = new Order(5l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 12), "NEW");
		Order order6 = new Order(6l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "DELIVERED");
		Order order7 = new Order(7l, LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 9), "PENDING");
		Order order8 = new Order(8l, LocalDate.of(2021, 3, 27), LocalDate.of(2021, 4, 5), "NEW");
		Order order9 = new Order(9l, LocalDate.of(2021, 4, 14), LocalDate.of(2021, 4, 18), "NEW");
		Order order10 = new Order(10l, LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 19), "NEW");
		Order order11 = new Order(11l, LocalDate.of(2021, 4, 1), LocalDate.of(2021, 4, 4), "DELIVERED");
		Order order12 = new Order(12l, LocalDate.of(2021, 2, 24), LocalDate.of(2021, 2, 28), "PENDING");
		Order order13 = new Order(13l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 21), "NEW");
		Order order14 = new Order(14l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "PENDING");
		Order order15 = new Order(15l, LocalDate.of(2021, 3, 13), LocalDate.of(2021, 3, 14), "DELIVERED");
		Order order16 = new Order(16l, LocalDate.of(2021, 3, 13), LocalDate.of(2021, 3, 21), "NEW");
		Order order17 = new Order(17l, LocalDate.of(2021, 3, 31), LocalDate.of(2021, 3, 31), "DELIVERED");
		Order order18 = new Order(18l, LocalDate.of(2021, 3, 25), LocalDate.of(2021, 3, 31), "PENDING");
		Order order19 = new Order(19l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 9), "DELIVERED");
		Order order20 = new Order(20l, LocalDate.of(2021, 3, 23), LocalDate.of(2021, 3, 30), "NEW");
		Order order21 = new Order(21l, LocalDate.of(2021, 3, 19), LocalDate.of(2021, 3, 24), "DELIVERED");
		Order order22 = new Order(22l, LocalDate.of(2021, 2, 27), LocalDate.of(2021, 3, 1), "NEW");
		Order order23 = new Order(23l, LocalDate.of(2021, 4, 19), LocalDate.of(2021, 4, 24), "PENDING");
		Order order24 = new Order(24l, LocalDate.of(2021, 3, 24), LocalDate.of(2021, 3, 24), "DELIVERED");
		Order order25 = new Order(25l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 10), "NEW");
		Order order26 = new Order(26l, LocalDate.of(2021, 3, 17), LocalDate.of(2021, 3, 26), "NEW");
		Order order27 = new Order(27l, LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25), "NEW");
		Order order28 = new Order(28l, LocalDate.of(2021, 4, 9), LocalDate.of(2021, 4, 16), "DELIVERED");
		Order order29 = new Order(29l, LocalDate.of(2021, 4, 6), LocalDate.of(2021, 4, 8), "PENDING");
		Order order30 = new Order(30l, LocalDate.of(2021, 4, 19), LocalDate.of(2021, 4, 20), "DELIVERED");
		Order order31 = new Order(31l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 4), "NEW");
		Order order32 = new Order(32l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 24), "DELIVERED");
		Order order33 = new Order(33l, LocalDate.of(2021, 4, 18), LocalDate.of(2021, 4, 24), "PENDING");
		Order order34 = new Order(34l, LocalDate.of(2021, 3, 28), LocalDate.of(2021, 3, 28), "NEW");
		Order order35 = new Order(35l, LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 17), "NEW");
		Order order36 = new Order(36l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 8), "DELIVERED");
		Order order37 = new Order(37l, LocalDate.of(2021, 3, 18), LocalDate.of(2021, 3, 25), "NEW");
		Order order38 = new Order(38l, LocalDate.of(2021, 4, 11), LocalDate.of(2021, 4, 20), "NEW");
		Order order39 = new Order(39l, LocalDate.of(2021, 4, 12), LocalDate.of(2021, 4, 17), "NEW");
		Order order40 = new Order(40l, LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 12), "PENDING");
		Order order41 = new Order(41l, LocalDate.of(2021, 2, 24), LocalDate.of(2021, 2, 26), "NEW");
		Order order42 = new Order(42l, LocalDate.of(2021, 4, 8), LocalDate.of(2021, 4, 14), "DELIVERED");
		Order order43 = new Order(43l, LocalDate.of(2021, 3, 3), LocalDate.of(2021, 3, 11), "NEW");
		Order order44 = new Order(44l, LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), "DELIVERED");
		Order order45 = new Order(45l, LocalDate.of(2021, 4, 1), LocalDate.of(2021, 4, 6), "DELIVERED");
		Order order46 = new Order(46l, LocalDate.of(2021, 3, 16), LocalDate.of(2021, 3, 22), "NEW");
		Order order47 = new Order(47l, LocalDate.of(2021, 4, 7), LocalDate.of(2021, 4, 12), "PENDING");
		Order order48 = new Order(48l, LocalDate.of(2021, 4, 5), LocalDate.of(2021, 4, 6), "NEW");
		Order order49 = new Order(49l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 13), "NEW");
		Order order50 = new Order(50l, LocalDate.of(2021, 3, 18), LocalDate.of(2021, 3, 21), "NEW");

		List<Order> orderList = Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8, order9,
				order10, order11, order12, order13, order14, order15, order16, order17, order18, order19, order20,
				order21, order22, order23, order24, order25, order26, order27, order28, order29, order30, order31,
				order32, order33, order34, order35, order36, order37, order38, order39, order40, order41, order42,
				order43, order44, order45, order46, order47, order48, order49, order50);
		
		/**
		 * 1. Filter out all delivered order
		 * 2. Filter out all new order
		 * 3. Filter out all pending orders
		 * 4. Filter out all pending orders whose delivery date is in April 
 		 */
		System.out.println("**************************Q1*************************");
		//Q1 Filter out all delivered order
		Predicate<Order> predDel = (o)->{
			return o.getStatus().equals("DELIVERED") ? true:false;
		};
		List<Order> delOrder = new ArrayList<Order>();
		
		for (Order order : orderList) {
			if(predDel.test(order)) {
				delOrder.add(order);
			}
		}
		System.out.println(delOrder);
		System.out.println("**************************Q2*************************");
		Predicate<Order> predNew = (o)->{
			return o.getStatus().equals("NEW") ? true:false;
		};
		List<Order> newOrder = new ArrayList<Order>();
		
		for (Order order : orderList) {
			if(predNew.test(order)) {
				newOrder.add(order);
			}
		}
		System.out.println(newOrder);
		
		System.out.println("**************************Q3*************************");
		Predicate<Order> predPending = (o)->{
			return o.getStatus().equals("PENDING") ? true:false;
		};
		List<Order> pendingOrder = new ArrayList<Order>();
		
		for (Order order : orderList) {
			if(predPending.test(order)) {
				pendingOrder.add(order);
			}
		}
		System.out.println(pendingOrder);
		System.out.println("**************************Q4*************************");
		Predicate<Order> predPendingApril = (o)->{
			return o.getStatus().equals("PENDING") &&(o.getDeliveryDate().getMonthValue() == 4) ? true:false;
		};
		List<Order> pendingAprilOrder = new ArrayList<Order>();
		
		for (Order order : orderList) {
			if(predPendingApril.test(order)) {
				pendingAprilOrder.add(order);
			}
		}
		System.out.println(pendingAprilOrder);
	}

}
