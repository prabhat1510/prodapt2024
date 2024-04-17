package java11and17features.patternmatchingwithstrings;

import java.util.Scanner;

public class NewSwtichExpression {

	public static void main(String[] args) {
		// Set the value of the day
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		// int day = 3;
		switch (day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		default -> System.out.println("Invalid day");
		}

		// Pattern Matching
		String course = "Advanced Java";

		switch (course) {
		case "Java" -> System.out.println("This is an java course");
		case "Advanced Java" -> System.out.println("This is an advance java course");
		case "C Program" -> System.out.println("This is an C Programming course");
		default -> System.out.println("No courses selected");
		}

		// Matching an Enum constants
		enum Month {
			JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY
		}
		;
		Month month = Month.MARCH;

		switch (month) {
		case JANUARY -> System.out.println("The month is January");
		case FEBRUARY -> System.out.println("The month is February");
		case MARCH -> System.out.println("The month is March");
		case APRIL -> System.out.println("The month is March");
		default -> System.out.println("Select the proper month");

		}

	}

}