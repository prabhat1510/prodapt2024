package studentassignment.dao;

import java.util.ArrayList;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private static List<Student> studentList = new ArrayList<Student>();

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

	@Override
	public List<Student> getAllStudents() {
		
		return studentList;
	}

	@Override
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException{
		List<Student> studWithSameCity = new ArrayList<Student>();
		for(Student student: studentList) {
			if(student.getCity().equalsIgnoreCase(city)) {
				studWithSameCity.add(student);				
			}
		}
		if(studWithSameCity != null && !studWithSameCity.isEmpty()) {
			return studWithSameCity;
		}else {
			throw new StudentNotFoundException("Student with city name "+city+" doesn't exists");
		}
	}

	@Override
	public Student getStudentById(Integer id) throws StudentNotFoundException {
		boolean isAvaliable =false;
		Student st =null;
		
		for(Student student: studentList) {
			if(student.getId() == id) {
				st =student;
				isAvaliable=true;
				break;
			}
		}
		if(!isAvaliable) {
			throw new StudentNotFoundException("Student with id "+id+" doesn't exists");
		}else {
			return st;
		}
		
	}

	
}
