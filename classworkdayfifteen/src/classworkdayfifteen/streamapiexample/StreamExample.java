package classworkdayfifteen.streamapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// 1. Data
		// 2. Collection is a source of data of which stream created
		List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> strm = numbers.stream();// Stream is created
		strm.forEach(System.out::println);// using forEach we are doing terminal operation on stream

		// Below code will give error as stream is closed due to line 14 terminal
		// operation
		// strm.filter(x->x>8)//filter is an intermediate operation
		// .forEach(System.out::println);//Terminal Operation

		Stream<List<String>> wordsStream = Stream
				.of(Arrays.asList("Hello", "All", "You", "Should", "Now", "Start", "Loving", "Java", "Programming"));

		Stream<String> words = Stream.of("Hi", "Hello", "Leave", "It", "Focus", "On", "Stream", "API");

		List<String> wordList = words.collect(Collectors.toList());
		// Java16 and above have toList() in Stream API
		// List<String> wordList = words.toList();
		wordList.forEach(System.out::println);

		// Lets create a stream
		Stream<Integer> streamOfInteger = Stream.of(10, 20, 30);// stream created
		System.out.println(streamOfInteger);

		List<Integer> newListOfIntegers =streamOfInteger 
					.filter(x -> x < 30)
					.toList();// Java16 and above have toList()
																						// in Stream API
		System.out.println(newListOfIntegers);

		// A stream can be obtained from sources like arrays or 
		// collections using stream()
		// As stream doesn’t store data, we need to define the source 
		//	to perform stream operations.
		// This is done by either creating stream or obtaining stream from
		// array/collections
		Integer[] values = new Integer[] { 10, 20, 30 }; // source of stream
		Stream<Integer> streamValues = Arrays.stream(values);// stream created
		// If you are using Java whose version is less than Java16 
		//please use collect
		// method to stream into a collection
		// streamValues.filter(x->x>10).collect(Collectors.toList());
		streamValues.collect(Collectors.toList());// terminal operation is happening here by 
		//calling collect method we are converting stream into List collection
	}

}
