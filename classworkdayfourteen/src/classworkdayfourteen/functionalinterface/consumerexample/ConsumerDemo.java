package classworkdayfourteen.functionalinterface.consumerexample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		System.out.println(consumer);
		consumer.accept("Sonu Kumar");

		Consumer<Integer> cons = (s) -> {
			if ((s % 2) != 0) {
				System.out.println(s + " is an odd number");
			} else {
				System.out.println(s + " is an even number");
			}
		};
		cons.accept(15);

		// Higher Order Function
		// This example accepts Consumer as an argument,
		// simulates a forEach to print each item from a list
		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6);

		Consumer<Integer> consumers = (Integer x) -> System.out.println(x);
		// General way of printing elements using consumer
		for (Integer n : listOfInteger) {
			consumers.accept(n);
		}

		System.out.println("**************Higher Order function is -- displayInfo********************");
		displayInfo(listOfInteger, consumers);
		
		System.out.println("*************Higher Order function is -- forEach*********************");
		listOfInteger.forEach(consumers);
		System.out.println("**********************************");
		listOfInteger.forEach((Integer x)->System.out.println(x));
		System.out.println("**********************************");
		displayInfo(listOfInteger, (Integer x)->System.out.println(x));
		
		System.out.println("**********************************");
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Infosys");
		map.put("2","AGL");
		map.put("3","Prodapt");
		map.put("4","Wipro");
		//map.forEach(null);
		map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	

		BiConsumer<String,String> biConsumer = (k,v) -> System.out.println("Key : " + k + ", Value : " + v);
		map.forEach(biConsumer);
	}

	// Custom higher order function
	public static <T> void displayInfo(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}
}
