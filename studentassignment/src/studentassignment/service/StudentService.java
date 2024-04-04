package studentassignment.service;

import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public interface StudentService {

	//Add student
	//Access Modifier Return Type Name of the method
	//(Method accepts Student type argument)
	public String addStudent(Student student) throws DataNotPresentException;
	
	 
	//Read All Students
	public List<Student> getAllStudents();	
	//Display or get all students belong to a particular city
	
	//Display all students - name wise sorted
	//Display all students - city wise sorted.
	//Find student by city name  
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException;

	//display or get students on the basis of given student id method and handle student not found exception
	public Student getStudentById(Integer id) throws StudentNotFoundException;
}
