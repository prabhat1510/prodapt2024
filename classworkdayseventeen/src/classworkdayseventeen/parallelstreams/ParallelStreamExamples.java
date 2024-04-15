package classworkdayseventeen.parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExamples {

	public static void main(String[] args) {
		
	System.out.println("********************Normal Stream***************************");
	IntStream rangeOfNumbers = IntStream.rangeClosed(1, 20);
	rangeOfNumbers.forEach(System.out::println);
	
	System.out.println("********************Parallel Stream***************************");
	 IntStream rangeOfNumbersParallel = IntStream.rangeClosed(1, 20);
	 rangeOfNumbersParallel.parallel().forEach(System.out::println);

	 System.out.println("******************************Normal Stream using stream()*************");
	 List<String> alphabet = getAlphaBet();
	 alphabet.stream().forEach(System.out::println);
	 
	 System.out.println("******************************Parallel Stream using parallelStream()*************");
	 List<String> alphabet2 = getAlphaBet();
	 alphabet2.parallelStream().forEach(System.out::println);
	
	 System.out.println("**********************************************************************************");
	 System.out.println(rangeOfNumbersParallel.isParallel());
	 IntStream rangeOfNumParallel = IntStream.rangeClosed(1, 20);
	 rangeOfNumParallel.parallel().forEach(x->{
		 	System.out.println("Thread :" +Thread.currentThread().getName() + " , value: "+x);
	 });
	 
	}

	private static List<String> getAlphaBet() {
		List<String> alpha = new ArrayList<String>();
		
		int n=97 ; //97=a  to 122=z
		while(n<=122) {
			char c = (char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}

}
