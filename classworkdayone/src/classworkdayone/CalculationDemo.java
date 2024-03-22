package classworkdayone;

public class CalculationDemo {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		calc.setNum1(11);
		calc.setNum2(12);
		System.out.println("I am CalculationDemo class");
		System.out.println(calc);

	}
		static {
			System.out.println("Inside static block in calculation Demo");
		}
}
