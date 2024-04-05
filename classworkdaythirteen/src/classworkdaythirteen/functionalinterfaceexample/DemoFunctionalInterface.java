package classworkdaythirteen.functionalinterfaceexample;

/**
 * By annotating below interface with @FunctionalInterface
 * We are ensuring that at compile time no rules related to 
 * functional interface is violated
 */
@FunctionalInterface
public interface DemoFunctionalInterface {
	public static final String message = "";//Constants
	public static final Integer number = 15;//Constants
	
	public void fun(String message);
	//public void fun1(String message);
	//public void fun2(String message);
	
	//Since Java 8 onwards normal interface can have static and default methods
	public default void funD() {
		System.out.println("I am having fun with default method");
	}
	public static void funS() {
		System.out.println("I am having fun with Static method");
	}
}
