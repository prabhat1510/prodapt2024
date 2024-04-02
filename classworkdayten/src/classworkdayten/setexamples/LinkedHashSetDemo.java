package classworkdayten.setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> setOfIntegers = new HashSet<Integer>();
		setOfIntegers.add(15);
		setOfIntegers.add(10);
		setOfIntegers.add(11);
		setOfIntegers.add(9);
		setOfIntegers.add(1);
		setOfIntegers.add(16);
		setOfIntegers.add(32);
		setOfIntegers.add(2);
		setOfIntegers.add(41);
		setOfIntegers.add(5);
		setOfIntegers.add(6);
		setOfIntegers.add(8);
		setOfIntegers.add(7);
		System.out.println(setOfIntegers);
		//setOfIntegers.forEach(System.out::println);
		System.out.println("*********************************");
		Set<Integer> setOfInteger = new LinkedHashSet<Integer>();
		setOfInteger.add(15);
		setOfInteger.add(10);
		setOfInteger.add(11);
		setOfInteger.add(9);
		setOfInteger.add(1);
		setOfInteger.add(16);
		setOfInteger.add(32);
		setOfInteger.add(2);
		setOfInteger.add(41);
		setOfInteger.add(5);
		setOfInteger.add(6);
		setOfInteger.add(8);
		setOfInteger.add(7);
		System.out.println(setOfInteger);
	}

}
