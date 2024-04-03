package classworkdayeleven.genericsexample;

import java.util.List;
import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		//Before Generics
		List listOfIntegers = new ArrayList();
		listOfIntegers.add(10);
		listOfIntegers.add("Hello");
		//Have to typecast to specific type of object
		Integer num = (Integer) listOfIntegers.iterator().next();
		String s = (String) listOfIntegers.iterator().next();
		
		//After Generics - No need to typecast
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(41);
		Integer n = listOfNumbers.iterator().next();
		
		Object obj = 15;
		Object[] arrObj = new Integer[5];
		//Not allowed
		//ArrayList<Object> oa = new ArrayList<Integer>();
		//ArrayList<Integer> ai = new ArrayList<Integer>();
		//ArrayList<Object> oa = ai;
		//oa.add(15);
		//Integer i = oa.get(0);
		
	}

}
