package java17features.patternmatchingswitch;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("************************************************************************************");
		enum Day {
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
		System.out.println("*******************To know who is on current shift enter the day*******************");
		System.out.println("*******************For Example : MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY*******************");
		Scanner sc = new Scanner(System.in);
		Day day = Day.valueOf(sc.next());
		
		Person person = new Person(1, "Raj");
		Person person1 = new Person(2, "Raju");
		Person person2 = new Person(3, "Rajesh");
		Person person3 = new Person(4, "RajKumar");

		Person persons = switch (day) {
		
		case MONDAY, FRIDAY-> {
			System.out.println(person);
			yield person;
		}
		case SUNDAY -> {
			System.out.println(person3);
			yield person3;
		}
		case TUESDAY -> {
			System.out.println(person1);
			yield person1;// take one argument, which is the value that the case label produces in a
							// switch expression.
			// return 7; //return statement is not permitted in switch expression instead
			// use yield
		}
		case THURSDAY, SATURDAY -> {
			System.out.println(person2);
			// yield 8;// no yield statement will give you error
			yield person2;
		}
		case WEDNESDAY -> {
			System.out.println(person3);
			yield person3;
		}
		default -> {
			throw new IllegalStateException("Invalid day: " + day);
		}
		};
		
		System.out.println("********************************************");
		System.out.println(persons);


	}

}
