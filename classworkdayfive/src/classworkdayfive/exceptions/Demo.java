package classworkdayfive.exceptions;

public class Demo {
	public static void main(String[] args) {
		int x=0;
		try {
			int y=10/x;//This line is throwing an exception
			System.out.println("y = "+y);
		}catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println("Division by zero not allowed");
		}
		
		System.out.println("Hello Exceptions");
	}
}
