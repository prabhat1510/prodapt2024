package jpaappwithannotations.service;

import java.util.List;

import jpaappwithannotations.dao.DepartmentDAO;
import jpaappwithannotations.dao.DepartmentDAOImpl;
import jpaappwithannotations.entities.Department;

public class DepartmentServiceImpl implements DepartmentService {
	DepartmentDAO departmentDao = new DepartmentDAOImpl();

	@Override
	public List<Department> getAllDepartment() {
		
		return departmentDao.getAllDepartment();
	}

	@Override
	public Department getDepartmentById(Integer deptNo) {
		return departmentDao.getDepartmentById(deptNo);
	}

	@Override
	public void addDepartment(Department department) {
		departmentDao.addDepartment(department);

	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	@Override
	public void deleteDepartment(Integer deptNo) {
		departmentDao.deleteDepartment(deptNo);

	}

	@Override
	public Department getDepartmentByName(String deptName) {
			return departmentDao.getDepartmentByName(deptName);
	}

	@Override
	public Integer updateDepartmentUsingQuery(Department department) {
			
		return departmentDao.updateDepartmentUsingQuery(department);
	}

	@Override
	public void deleteDepartmentByName(String deptName) {
		departmentDao.deleteDepartmentByName(deptName);
		
	}

}
