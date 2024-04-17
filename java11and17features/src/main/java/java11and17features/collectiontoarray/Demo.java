package java11and17features.collectiontoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(10);
		list.add(11);
		/**
		 * The new default toArray() method is used to easily convert a collection to 
		 * an array of the correct type
		 * 
		 */
		Integer[] intArr = list.toArray(Integer[]::new);
		for(Integer i : intArr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(intArr));
	}

}
