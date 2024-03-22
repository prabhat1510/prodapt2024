package classworkdayone;

public class Calculation {
	
	private int num1;
	private int num2;
	
	private static int number1;
	private static int number2;
	
	static {
		number1=15;
		number2=10;
		System.out.println("I am inside static block I will executed first");
		System.out.println("sum of two numbers is -- "+(number1+number2));
	}

	public Calculation() {
		System.out.println("I am no argument constructor");
	}

	public Calculation(int num1, int num2) {
		System.out.println("I am parameterised constructor");
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static int getNumber1() {
		return number1;
	}

	public static void setNumber1(int number1) {
		Calculation.number1 = number1;
	}

	public static int getNumber2() {
		return number2;
	}

	public static void setNumber2(int number2) {
		Calculation.number2 = number2;
	}

	@Override
	public String toString() {
		return "Calculation [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	
	
	
	
}
