package classworkdayfourteen.functionalinterface.predicateexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 14, 15, 16, 18, 1, 2, 4, 6, 3, 7, 5);
		Predicate<Integer> predicate = (s) -> {
			/*
			 * if(s > 5) { return true; }else { return false; }
			 */
			return (s > 5) ? true : false;
		};

		Boolean isNumberGreaterThanFive = false;
		List<Integer> numGTFive = new ArrayList<Integer>();
		for (Integer n : numbers) {
			isNumberGreaterThanFive = predicate.test(n);
			if (isNumberGreaterThanFive) {// if(predicate.test(n) {
				numGTFive.add(n);
			}
			System.out.println(n + " is greater than five " + isNumberGreaterThanFive);
		}
		System.out.println(numGTFive);
		System.out.println("***************************************************");
		// Using stream api filter method
		numbers.stream().filter(predicate).forEach(System.out::println);

		System.out.println("***************************************************");
		List<String> words = Arrays.asList("Good", "Afternoon", "Please", 
				"Forgive", "Me", "From", "Learning", "These",
				"Concept");
		Predicate<String> pred = (w) -> {
			if (w.length() > 5) {
				return true;
			} else {
				return false;
			}
		};
		
		for(String word :words) {
			if(pred.test(word)) {
				System.out.println(word);
			}
		}
	}

}
