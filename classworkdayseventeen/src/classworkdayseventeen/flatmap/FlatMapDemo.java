package classworkdayseventeen.flatmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	public static void main(String[] args) {
		
		try {
			Files.lines(Paths.get("D:\\prodapt2024\\text.txt"))
				.map(line->line.split("\\s+"))
				.flatMap(Arrays::stream)//Flatens the stream and returns Stream<String>
			.distinct().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		System.out.println("**************************Order Amount USD to INR conversion using flatMap******************************");
		Order o1 = new Order(1,Arrays.asList(155,10,20));
		Order o2 = new Order(2,Arrays.asList(11,10,100));
		Order o3 = new Order(3,Arrays.asList(15,100,30));
		Order o4 = new Order(4,Arrays.asList(25,101,20));
		Order o5 = new Order(5,Arrays.asList(30,20,400));
		Order o6 = new Order(6,Arrays.asList(50,102,120));
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(o6);
		orders.add(o5);
		orders.add(o4);
		orders.add(o3);
		orders.add(o2);
		orders.add(o1);
		
		Integer totalOrderAmountInINR = orders.stream().map(Order::getOrderAmount)
		.flatMap(amounts->amounts.stream().map(amount->amount*83))
		.reduce(0, (x,y)->x+y);
		//.forEach(System.out::println);
		
		System.out.println(totalOrderAmountInINR);
		
		//Integer totalOrderAmountInINRr = orders.stream().map(Order::getOrderAmount).reduce(0, (x,y)->x+y);
	}
	
	
}
