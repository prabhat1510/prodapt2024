package com.prodapt.hrmsapp.service;

import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.dao.EmployeeDAO;
import com.prodapt.hrmsapp.dao.EmployeeDAOImpl;
import com.prodapt.hrmsapp.exceptions.EmployeeNotFoundException;
import com.prodapt.hrmsapp.exceptions.OperationNotExecutedException;
import com.prodapt.hrmsapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String addEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.addEmployee(employee);
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFoundException {
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public String updateEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.updateEmployee(employee);
	}

	@Override
	public Optional<String> deleteEmployee(Integer employeeId) throws EmployeeNotFoundException {
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.deleteEmployee(employeeId);
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

	@Override
	public String insertEmployeeAndDepartment(Employee employee) throws OperationNotExecutedException {
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.insertEmployeeAndDepartment(employee);
	}

}
