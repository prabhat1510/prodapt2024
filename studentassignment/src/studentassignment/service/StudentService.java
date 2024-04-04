package studentassignment.service;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.model.Student;

public interface StudentService {

	//Add student
	//Access Modifier Return Type Name of the method
	//(Method accepts Student type argument)
	public String addStudent(Student student) throws DataNotPresentException;
}
