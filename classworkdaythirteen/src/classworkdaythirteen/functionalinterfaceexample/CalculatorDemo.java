package classworkdaythirteen.functionalinterfaceexample;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// ()->System.out.println("Hello");
		while (true) {
			System.out.println("*******What you want to calculate ?********");
			System.out.println("*******Enter approriate number*******");
			System.out.println("1.Addition \n");
			System.out.println("2.Subtraction \n");
			System.out.println("3.Multiplication \n");
			System.out.println("4.Exit");
			Scanner s = new Scanner(System.in);
			Integer operation = s.nextInt();
			System.out.println("******Enter two numbers**********");
			Integer number1 = s.nextInt();
			Integer number2 = s.nextInt();
			switch (operation) {
			case 1:
				Calculator add = (num1, num2) -> num1 + num2;
				Integer addResult = add.calculate(number1, number2);
				System.out.println(addResult);
				break;
			case 2:
				Calculator subtract = (num1, num2) -> num1 - num2;
				Integer subResult = subtract.calculate(number1, number2);
				System.out.println(subResult);
				break;
			case 3:
				Calculator multiply = (num1, num2) -> num1 * num2;
				Integer multiplyResult = multiply.calculate(number1, number2);
				System.out.println(multiplyResult);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter appropriate operation number");
				break;
			}
		}

	}

}
