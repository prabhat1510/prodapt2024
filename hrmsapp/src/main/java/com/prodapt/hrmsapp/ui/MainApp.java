package com.prodapt.hrmsapp.ui;

import com.prodapt.hrmsapp.model.Department;
import com.prodapt.hrmsapp.service.DepartmentService;
import com.prodapt.hrmsapp.service.DepartmentServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Department marketing = new Department(1, "Marketing");
		Department finance = new Department(2, "Finance");
		Department informationTech = new Department(3, "IT");
		Department operations = new Department(4, "Operations");

		DepartmentService deptService = new DepartmentServiceImpl();
		String markMsg = deptService.addDepartment(marketing);
		System.out.println(markMsg);
		String finMsg = deptService.addDepartment(finance);
		System.out.println(finMsg);
		String itMsg = deptService.addDepartment(informationTech);
		System.out.println(itMsg);
		String opsMsg = deptService.addDepartment(operations);
		System.out.println(opsMsg);
	}

}
