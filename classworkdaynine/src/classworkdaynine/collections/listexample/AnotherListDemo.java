package classworkdaynine.collections.listexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnotherListDemo {

	public static void main(String[] args) {
		//Arrays.asList() returns a fixed size list which not modifiable
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> wordList = Arrays.asList("Arthi","Himangi","Gokul","Mahi","Rishi");
		//listOfNumbers.add(11);//No compilation error but at runtime we will get exception
		System.out.println(listOfNumbers);
		//listOfNumbers.remove(2);
		System.out.println(listOfNumbers);
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(15);
		numList.add(5);
		numList.add(51);
		numList.add(150);
		numList.add(1);
		numList.add(0);
		System.out.println(numList);
		System.out.println(numList.reversed());
		numList.sort(null);
		System.out.println(numList);
		System.out.println(numList.indexOf(150));
		System.out.println(numList.getFirst());
		
	}

}
