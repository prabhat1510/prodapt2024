package studentassignment.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;
import studentassignment.service.StudentService;
import studentassignment.service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		// Creating data to be stored in DAO layer
		Student stud = new Student();
		stud.setId(1);
		stud.setName("MS Dhoni");
		stud.setCity("Ranchi");
		Student stud1 = new Student(2, "SKY", "Lucknow");
		Student stud2 = new Student(3, "R Ashwin", "Chennai");
		Student stud3 = new Student(4, "Ishan Kishan", "Patna");
		Student stud4 = new Student(5, "Virat Kohli", "New Delhi");
		Student stud5 = new Student(6, "Rohit Sharma", "New Delhi");
		Student stud6 = new Student(7, "Irfan Pathan", "Ahmedabad");
		Student stud7 = new Student(8, "Yusuf Patha", "Ahmedabad");
		Student stud8 = new Student(9, "Sorauv Ganguly", "Kolkata");
		Student stud9 = new Student(10, "Sunil Gavaskar", "Mumbai");
		Student stud10 = new Student(11, "Ishant Sharma", "New Delhi");
		Student stud11 = new Student(12, "Mohammed Kaif", "Muradabad");
		Student stud12 = new Student(13, "Kapil Dev", "Chandigarh");
		// Call the service class method addStudent
		// Create an object of service class
		StudentService studentService = new StudentServiceImpl();
		/**System.out.println(studentService.addStudent(stud12));
		System.out.println(studentService.addStudent(stud11));
		System.out.println(studentService.addStudent(stud10));
		System.out.println(studentService.addStudent(stud9));
		System.out.println(studentService.addStudent(stud8));
		System.out.println(studentService.addStudent(stud7));
		System.out.println(studentService.addStudent(stud6));
		System.out.println(studentService.addStudent(stud5));
		System.out.println(studentService.addStudent(stud4));
		System.out.println(studentService.addStudent(stud3));
		System.out.println(studentService.addStudent(stud2));
		System.out.println(studentService.addStudent(stud1));
		System.out.println(studentService.addStudent(stud));*/
		Student studNull = null;
		List<Student> studentList = Arrays.asList(stud, stud1, stud2, stud3, 
				stud4, stud4, stud5, stud6, stud7, stud8,
				stud9, stud10, stud11, stud12,studNull);

		for (Student student : studentList) {
			try {
				System.out.println(studentService.addStudent(student));
			} catch (DataNotPresentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//Read All Students from Data layer(or Data base or collection)
		List<Student> studList=studentService.getAllStudents();
		System.out.println(studList);
		
		//Name wise sorting
		Collections.sort(studList,Comparator.comparing(Student::getName));
		System.out.println(studList);
		
		//City wise sorting 
		Collections.sort(studList,Comparator.comparing(Student::getCity));
		System.out.println(studList);
		//Get student by id 
		try {
			Student stu1 = studentService.getStudentById(11);
			System.out.println(stu1);
			Student stu2 = studentService.getStudentById(15);
			System.out.println(stu2);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//Display All students from a particular city
		try {
			List<Student> stuList= studentService.getStudentByCity("Mumbai");
			System.out.println(stuList);
			List<Student> stuList1= studentService.getStudentByCity("Lucknow");
			System.out.println(stuList1);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
