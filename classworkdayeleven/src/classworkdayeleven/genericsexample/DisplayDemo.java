package classworkdayeleven.genericsexample;

import java.util.Arrays;

public class DisplayDemo {

	public static void main(String[] args) {
		Display display = new Display();
		display.display(Arrays.asList(1,2,3,4,54,5,6,7,8));
		display.display(Arrays.asList("Hello","Happy","to","learn","Generics"));
	
		display.displayInteger(Arrays.asList(1,2,3,4,54,5,6,7,8));
		//display.displayInteger(Arrays.asList("Hello","Happy","to","learn","Generics"));
	}

}
