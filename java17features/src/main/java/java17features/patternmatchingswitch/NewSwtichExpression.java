package java17features.patternmatchingswitch;

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

		enum DaysOftheWeek {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}
		DaysOftheWeek days = DaysOftheWeek.SUNDAY;

		switch (days) {
		case SUNDAY -> System.out.println("Its a lazy Sunday");
		case MONDAY -> System.out.println("Its a boring Monday");
		case TUESDAY -> System.out.println("Its a  hectic Tuesday");
		case WEDNESDAY -> System.out.println("Its ok Wednesday");
		case THURSDAY -> System.out.println("Its a  weekend mood Thursday");
		case FRIDAY -> System.out.println("TGIF");
		case SATURDAY -> System.out.println("Its a  weekend");
		default -> System.out.println("Every day is good");
		}

		System.out.println(
				"**************************Use of ENUM from external source file**************************************");
		switch (Status.DELIVERED) {
		case Status.NEW -> System.out.println("Order is placed");
		case Status.PENDING -> System.out.println("Order is pending");
		case Status.DELIVERED -> System.out.println("Order is delivered");
		}

		System.out.println("************************************************************************************");
		enum Day {
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
		;
		Day dayO = Day.WEDNESDAY;
		System.out.println(switch (dayO) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> throw new IllegalStateException("Invalid day: " + day);
		});
		System.out.println(Day.SUNDAY);// Ctrl+Alt+ Down Arrow to copy line
		System.out.println(Day.MONDAY);
		System.out.println(Day.TUESDAY);
		System.out.println(Day.WEDNESDAY);
		System.out.println(Day.THURSDAY);
		System.out.println(Day.FRIDAY);
		System.out.println(Day.SATURDAY);
		System.out.println(Day.values());
		System.out.println(Day.valueOf("MONDAY"));
		System.out.println(Day.valueOf(Day.class, "WEDNESDAY"));

		System.out.println("***************************************************************************************");
		Day dayO1 = Day.TUESDAY;
		int numLetters = switch (dayO1) {
		case MONDAY, FRIDAY, SUNDAY -> {
			System.out.println(6);
			yield 6;
		}
		case TUESDAY -> {
			System.out.println(7);
			yield 7;// take one argument, which is the value that the case label produces in a
					// switch expression.
			// return 7; //return statement is not permitted in switch expression instead
			// use yield
		}
		case THURSDAY, SATURDAY -> {
			System.out.println(8);
			// yield 8;// no yield statement will give you error
			yield 8;
		}
		case WEDNESDAY -> {
			System.out.println(9);
			yield 9;
		}
		default -> {
			throw new IllegalStateException("Invalid day: " + day);
		}
		};

		System.out.println(numLetters);

		
	}

}