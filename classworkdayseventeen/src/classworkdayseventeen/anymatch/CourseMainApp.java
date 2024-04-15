package classworkdayseventeen.anymatch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CourseMainApp {

	public static void main(String[] args) {
		Course csc = new Course(1, "Computer Science");
		Course phy = new Course(2, "Physics");
		Course chem = new Course(3, "Chemistry");
		Course math = new Course(4, "Mathematics");
		
		Student stud1 = new Student(1, "Rahul", 20, List.of(phy,chem,math), LocalDate.of(2003, 10, 15));
		Student stud2 = new Student(2, "Raj", 23, List.of(phy,chem,math,csc), LocalDate.of(2000, 1, 11));
		Student stud3 = new Student(3, "Raju", 21, List.of(phy,chem), LocalDate.of(2002, 9, 14));
		Student stud4 = new Student(4, "Rajesh", 22, List.of(chem,math), LocalDate.of(2001, 6, 10));
		
		List<Student> listOfStudent=new ArrayList<Student>();
		listOfStudent.add(stud1);
		listOfStudent.add(stud2);
		listOfStudent.add(stud3);
		listOfStudent.add(stud4);
		
		System.out.println(stud1.getCourses());
		
		Predicate<Student> studentHasPhyCourse = student -> student.getCourses().contains(phy);
		
		System.out.println(listOfStudent.stream().anyMatch(studentHasPhyCourse));
		
		
		Predicate<Student> studentHasChemCourse = student -> student.getCourses().contains(chem);
		System.out.println(listOfStudent.stream().allMatch(studentHasChemCourse));
		
		
		Predicate<Student> studentAgeLessThan18 = student->student.getAge()<18;
		
		System.out.println(listOfStudent.stream().noneMatch(studentAgeLessThan18));
	}

}
