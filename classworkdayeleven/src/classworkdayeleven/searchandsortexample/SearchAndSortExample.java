package classworkdayeleven.searchandsortexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchAndSortExample {

	public static void main(String[] args) {
		int arr[] = {10,5,2,4,8};
		Arrays.sort(arr);//2,4,5,8,10
		System.out.println(Arrays.binarySearch(arr, 4));
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 7));
		System.out.println(Arrays.binarySearch(arr, 90));
		System.out.println(Arrays.toString(arr));
		
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(15);//0 index position
		listOfNumbers.add(10);//1 index position
		listOfNumbers.add(9);//2 index position
		listOfNumbers.add(215);//3 index position
		listOfNumbers.add(115);//4 index position
		listOfNumbers.add(150);//5 index position
		Collections.sort(listOfNumbers);//After sorting index position will change
		System.out.println(listOfNumbers);
		System.out.println("***************************************************");
		int number = Collections.binarySearch(listOfNumbers, 10);//index of element found
		if(number !=-1) {
			System.out.println("Number 10 found at index position "+number);
		}
		
		

	}

}
