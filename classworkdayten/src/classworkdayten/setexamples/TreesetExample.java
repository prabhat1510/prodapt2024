package classworkdayten.setexamples;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setId(11);
		stud1.setName("Aswin");
		stud1.setDateOfBirth(LocalDate.of(2000, 10, 15));
		Student stud2 = new Student(12,"Rajesh",LocalDate.of(2001, 11, 16));
		Student stud3 = new Student(13,"ShakthiVel",LocalDate.of(2000, 9, 11));
		Student stud4 = new Student(14,"Thiru",LocalDate.of(2002, 8, 15));
		Student stud5 = new Student(16,"Rishidhar",LocalDate.of(2000, 6, 10));
		//Two different objects with same values or data
		Student stud6 = new Student(12,"Rajesh",LocalDate.of(2001, 11, 16));
		Student stud7 = new Student(13,"ShakthiVel",LocalDate.of(2000, 9, 11));
		
		Set<Student> setOfStudents = new TreeSet<Student>();
		setOfStudents.add(stud1);
		setOfStudents.add(stud4);
		setOfStudents.add(stud5);
		setOfStudents.add(stud7);
		setOfStudents.add(stud3);
		setOfStudents.add(stud2);
		setOfStudents.add(stud6);
		System.out.println(setOfStudents);
		
		Iterator itr = setOfStudents.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
