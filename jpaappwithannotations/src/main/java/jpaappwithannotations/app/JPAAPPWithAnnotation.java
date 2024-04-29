package jpaappwithannotations.app;

import jpaappwithannotations.entities.Department;
import jpaappwithannotations.service.DepartmentService;
import jpaappwithannotations.service.DepartmentServiceImpl;

public class JPAAPPWithAnnotation {

	public static void main(String[] args) {
		DepartmentService departmentService = new DepartmentServiceImpl();
		
		
		
		//Create 
		Department department = new Department();
		department.setDeptName("IT");
		departmentService.addDepartment(department);
		
		//Retrieve
				Department dept = departmentService.getDepartmentById(1);
				System.out.println(dept);
		//Retrieve All Department
				System.out.println(departmentService.getAllDepartment());
	}

}
