package com.prodapt.hrmsapp.dao;

import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.exceptions.DepartmentNotFoundException;
import com.prodapt.hrmsapp.model.Department;

public interface DepartmentDAO {
	// Create
	public String addDepartment(Department department);

	// Retrieve By departmentId
	public Optional<Department> getDepartmentById(Integer departmentId) throws DepartmentNotFoundException;

	// Update Department
	public String updateDepartment(Department department);

	// Delete Department
	public Optional<String> deleteDepartment(Integer departmentId) throws DepartmentNotFoundException;

	// Retrieve all Department
	public List<Department> getAllDepartment() throws DepartmentNotFoundException;

	// Retrieve By Department name
	public Optional<Department> getDepartmentByName(String departmentName) throws DepartmentNotFoundException;

}
