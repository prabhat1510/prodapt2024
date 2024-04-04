package studentassignment.service;

import java.util.List;

import studentassignment.dao.StudentDAO;
import studentassignment.dao.StudentDAOImpl;
import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student student) throws DataNotPresentException{
		//Create an object of DAO Impl class
		StudentDAO studentDAO = new StudentDAOImpl();
		//Using above object call the addStudent 
		//and pass the student reference variable
		//addStudent method on successful addition returns message
		String message = studentDAO.addStudent(student);
		//return the message to the caller
		return message;
	}

	@Override
	public List<Student> getAllStudents() {
		StudentDAO studentDAO = new StudentDAOImpl();
		List<Student> student =studentDAO.getAllStudents();
		return student;
	}

	@Override
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDAOImpl();
		return studentDAO.getStudentByCity(city);
	}

	@Override
	public Student getStudentById(Integer id) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDAOImpl();
		return studentDAO.getStudentById(id);
	}

}
