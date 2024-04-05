package classworkdaythirteen.functionalinterfaceexample;

public class DemoFunctionalInterfaceApp {

	public static void main(String[] args) {
		DemoFunctionalInterface dfi = new DemoFunctionalInterfaceImpl();
		dfi.fun("This is what you have learned in OOPs concept !!!");
		
		
		//Concise to write the implementation of your abstract method of 
		//an interface(normal or functional) using lambda expression
		/**
		 * Syntax of lambda expression
		 * (Zero or more arguments)->Logical Statement or Expression
		 */
		DemoFunctionalInterface dfil =(message)->System.out.println(message);
		dfil.fun("This is the lambda expression ... "
				+ "an implementation of an abstract method of an interface");

	}

}
