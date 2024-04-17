package java11and17features.localvariableinlambda;

import lombok.NonNull;

public class Demo {

	public static void main(String[] args) {
		//(a,b)->a+b
		Cal cal = (@NonNull var a, @NonNull var b) -> a + b;
		int result = cal.sum(10, 20);
		System.out.println(result);
		
		//no mixing allowed
		//Cal cal1 =(var a, Integer b)->a+b;
		//no skipping allowed
		//Cal cal1 =(var a, Integer b)->a+b;
		//Not allowed
		//Cal cal1 = var a ->a+b;
		//Cal cal1 = (a,b)-> a+b;
		/**
		 * 
		 * 
		 * (var s1, s2) -> s1 + s2 //no skipping allowed 
		 * (var s1, String y) -> s1 + y //no mixing allowed 
		 * var s1 -> s1 //not allowed. Need parentheses if you use var in lambda. 
		 * 
		 * If there are multiple parameters then use var with all the
		 * parameters. No skipping allowed.
		 * 
		 * If one parameter use var then other parameters must use var rather than other
		 * types like int, float, etc.
		 * 
		 * Must use parenthesis () while using the var with the parameters.
		 */
		
		/**
		String entry = "Book Title:Unseen";//1 object
		String catalogEntry="Book"+" Title:"+"Unseen" ;//3 object
		String displayEntry="Book "+"Title: "+"Unseen" ;//1
		String reportEntry = "Book Title:"+"Unseen";**/
	}

}
