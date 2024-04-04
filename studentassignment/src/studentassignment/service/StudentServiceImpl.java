package studentassignment.service;

import studentassignment.dao.StudentDAO;
import studentassignment.dao.StudentDAOImpl;
import studentassignment.exceptions.DataNotPresentException;
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

}
