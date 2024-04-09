package classworkdayfifteen.methodreferenceexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerMethodReferenceExample {

	public static void main(String[] args) {
		/**
		 * Using method reference
		 * Here we are passing reference of println()
		 * method
		 **/
		Consumer<String> cons =System.out::println;
		cons.accept("Happy New Year !!");
		
		System.out.println("******************************************");
		List<String> movieName = Arrays.asList("Teri",
				"Baton","Me","Uljha","Jia","Oh","No","Sifra",
				"Is","A","Robot");
		for(String mName: movieName) {
			cons.accept(mName);
		}
		
		Consumer<String> consumer =String::length;
		for(String mName: movieName) {
			cons.accept(mName);
		}
		System.out.println("******************************************");
		Function<String,Integer> func = String::length;
		for(String mName: movieName) {
			System.out.println(func.apply(mName));
		}
	}

}
