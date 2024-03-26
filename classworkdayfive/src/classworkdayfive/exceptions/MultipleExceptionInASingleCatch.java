package classworkdayfive.exceptions;

public class MultipleExceptionInASingleCatch {

	public static void main(String[] args) {
		try {
			int l = args.length;
			System.out.println("l = " + l);
			int b = 42 / l;
			int arr[] = { 1 };
			arr[22] = 99;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
			System.out.println("Divide by 0 or  Array index oob" + aioobe);
		} catch(Exception e) {
			System.out.println("Exception Occurred");
		}
		System.out.println("After try/catch blocks.");
	}

}
