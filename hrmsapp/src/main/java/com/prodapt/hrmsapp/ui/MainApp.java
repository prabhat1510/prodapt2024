package com.prodapt.hrmsapp.ui;

import com.prodapt.hrmsapp.model.Department;
import com.prodapt.hrmsapp.model.Employee;
import com.prodapt.hrmsapp.service.DepartmentService;
import com.prodapt.hrmsapp.service.DepartmentServiceImpl;
import com.prodapt.hrmsapp.service.EmployeeService;
import com.prodapt.hrmsapp.service.EmployeeServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("***************************************Department Insert Operations******************");
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
		System.out.println("***************************************Department Insert  Operations Ends******************");
		Employee emp1 = new Employee(1, "Rakesh", marketing, 15000.00, 23, "Associate");
		Employee emp2 = new Employee(2, "Rajesh", finance, 15500.00, 26, "Manager");
		Employee emp3 = new Employee(3, "Ram", marketing, 25000.00, 25, "Sr Associate");
		Employee emp4 = new Employee(4, "Raja", operations, 15500.00, 25, "Associate");
		Employee emp5 = new Employee(5, "Kumar", marketing, 45000.00, 27, "Director");
		Employee emp6 = new Employee(6, "Sita", finance, 65500.00, 21, "VP");
		Employee emp7 = new Employee(7, "Geeta", informationTech, 35000.00, 22, "Associate");
		Employee emp8 = new Employee(8, "Neeta", operations, 11500.00, 29, "Director");
		 
		EmployeeService empService = new EmployeeServiceImpl();
		empService.addEmployee(emp1);
	}

}
