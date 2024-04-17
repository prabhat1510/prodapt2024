package com.prodapt.hrmsapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.exceptions.EmployeeNotFoundException;
import com.prodapt.hrmsapp.model.Employee;
import com.prodapt.hrmsapp.utility.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public String addEmployee(Employee employee) {
		Connection conn = DBConnectionUtil.getDBConnection();
		//PreparedStatement pStmt = conn.prepareStatement("");
		     //pStmt.setInt(6,employee.getDepartment().getDeptNo());
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteEmployee(Integer employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeByName(String employeeName) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
