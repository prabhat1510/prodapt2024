package classworkdayfourteen.functionalinterface.functionexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// Here example takes <T> String and returns the length of the string as <R>
		// Integer

		// Function<T,R>
		Function<String, Integer> func = x -> x.length();

		Integer apply = func.apply("Prabhat");
		System.out.println(apply);

		System.out.println("************************************");

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
		// Implementation of apply method of Function interface
		Function<Integer, Integer> squareFun = x -> x * x;
		// New list to store square of numbers
		List<Integer> sqNums = new ArrayList<Integer>();
		// For each number in list of numbers apply the function
		for (Integer num : numbers) {
			// Adding result into a new list referred by sqNums
			sqNums.add(squareFun.apply(num));
		}
		System.out.println(sqNums);

		System.out.println("************************************");
		Function<String, Integer> func1 = x -> x.length();
		Function<Integer, Integer> func2 = x -> x * 2;
		//func is implementation of Function functional interface apply method
		Integer result = func1.andThen(func2).apply("Demo");
		System.out.println(result);

		
		
		System.out.println("************************************");
		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

		Function<Integer, Integer> f = x -> x * 2;
		Function<Integer, Integer> f2 = x -> x + 5;

		Integer r = f.andThen(f2).apply(5);
		System.out.println(r);
		
		System.out.println("************************************");
		List<Double> listOfDouble = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0);
		BiFunction<Double, Double,Double> f1 = (x,y) -> Math.pow(x, y);
		Function<Double,Double> f3 = (x) -> x * 5;
		Double rs=0.0;
		for(Double d : listOfDouble) {
		 rs= f1.andThen(f3).apply(d,5.0);
		}
		System.out.println(rs);
		
		/**
		 * List of Numbers 1,2,3,4,5,6
		 * 1*1*1
		 * 2*2*2
		 * 
		 * and then get the summation of all cubes
		 * 
		 */
		System.out.println("************************************");
		List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4);
		/*
		 * Function<Integer,Integer> fun1 = (x)->x*x*x; Function<Integer, Integer>
		 * biFun2 = (x)->x+y; Integer res =0; for(Integer n : listOfInt) { res=
		 * fun1.andThen(biFun2).apply(n, res); } System.out.println(res);
		 */
		Function<Integer,Integer> fun1 = (x)->x*x*x;
		Integer sum = listOfInt.stream().map(fun1).reduce(0,(x,y)->x+y);
		System.out.println(sum);
	}

}
