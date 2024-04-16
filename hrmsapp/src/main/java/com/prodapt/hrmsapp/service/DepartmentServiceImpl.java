package com.prodapt.hrmsapp.service;

import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.dao.DepartmentDAO;
import com.prodapt.hrmsapp.dao.DepartmentDAOImpl;
import com.prodapt.hrmsapp.exceptions.DepartmentNotFoundException;
import com.prodapt.hrmsapp.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public String addDepartment(Department department) {
		DepartmentDAO dao = new DepartmentDAOImpl();
		return dao.addDepartment(department);
	}

	@Override
	public Optional<Department> getDepartmentById(Integer departmentId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteDepartment(Integer departmentId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Department> getAllDepartment() throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDepartmentByName(String departmentName) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
