package classworkdayfourteen.functionalinterface.consumerexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImplDemo {

	public static void main(String[] args) {
		Consumer<Integer> cons = new ConsumerImpl();
		cons.accept(15);
		
		
		//Using lambda expression
		
		Consumer<String> conss =(str)->System.out.println(str.length()); 
		conss.accept("Hello");
		
		//Passing consumer or lambda expression as an argument to another function
		List<Integer> listOfNumbers = Arrays.asList(2,3,1,4,1,5,6,7);
		Consumer<Integer> consumer = (n)->System.out.println(n);
		
		printNumbers(listOfNumbers,consumer);
		System.out.println("***********************************************");
		Consumer<Integer> coonsumer =(t)-> {if ((t % 2) != 0) {
			System.out.println(t + " is an odd number");
		} else {
			System.out.println(t + " is an even number");
		}};
		printNumbers(listOfNumbers, coonsumer);
	}

	private static void printNumbers(List<Integer> listOfNumbers, Consumer<Integer> consumer) {
		for(Integer num :listOfNumbers) {
			consumer.accept(num);
		}
		
	}

}
