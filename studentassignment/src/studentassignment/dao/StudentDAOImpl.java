package studentassignment.dao;

import java.util.ArrayList;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.model.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private List<Student> studentList = new ArrayList<Student>();

	@Override
	public String addStudent(Student student) throws DataNotPresentException{
		// Need a collection to store student data
		if (student != null) {
			studentList.add(student);
			return "Student with student id " + student.getId() + " added successfully";
		} else {
			throw new DataNotPresentException("Unable to add student as no data was provided");
		}
	}

}
