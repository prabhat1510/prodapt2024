package classworkdayfive.exceptions;

public class MultipleCatch {
	public static void main(String args[]) {
		try {
			int l = args.length;
			System.out.println("l = " + l);
			int b = 42 / l;
			int arr[] = { 1 };
			arr[22] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Array index oob: " + aioobe);
		}
		System.out.println("After try/catch blocks.");

	}
}
