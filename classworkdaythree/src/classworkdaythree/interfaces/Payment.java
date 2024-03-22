package classworkdaythree.interfaces;

public interface Payment {

	public int getPayment();
	
	//Default method in interface introduced in Java 8
	public default void displayInfo() {
		System.out.println("I am displayInfo method inside abstract class Payment");
	}
	
	//Static method in interface is introduced in Java 8
	public static void displayInformation() {
		System.out.println("I am displayInfo method inside abstract class Payment");
	}
}
