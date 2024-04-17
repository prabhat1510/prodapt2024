package com.prodapt.hrmsapp.dao;

import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.exceptions.EmployeeNotFoundException;
import com.prodapt.hrmsapp.model.Employee;

public interface EmployeeDAO {
	// Create
	public String addEmployee(Employee employee);

	// Retrieve By employeeId
	public Optional<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFoundException;

	// Update Employee
	public String updateEmployee(Employee employee);

	// Delete Employee
	public Optional<String> deleteEmployee(Integer employeeId) throws EmployeeNotFoundException;

	// Retrieve all Employee
	public List<Employee> getAllEmployee() throws EmployeeNotFoundException;

	// Retrieve By Employee name
	public Optional<Employee> getEmployeeByName(String employeeName) throws EmployeeNotFoundException;

}