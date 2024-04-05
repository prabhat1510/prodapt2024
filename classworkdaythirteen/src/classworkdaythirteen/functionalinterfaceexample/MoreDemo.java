package classworkdaythirteen.functionalinterfaceexample;

import java.util.Arrays;
import java.util.List;

public class MoreDemo {

	public static void main(String[] args) {
		// List of number
		List<Integer> listOfNumber = Arrays.asList(2, 3, 1, 4, 5, 6, 7);
		List<String> words = Arrays.asList("Hello","Boring","Teacher","Talking"
				,"Technical","Stuff","Always","But","You","Guys","Always","Chit Chat");
		
		words.forEach((w)->System.out.println(w+" length is "+w.length()));
		/**Left Hand side -> Right hand side
		 * ()->{}
		 */
	}

}
