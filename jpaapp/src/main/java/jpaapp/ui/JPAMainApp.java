package jpaapp.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpaapp.entities.Department;
import jpaapp.entities.Employee;
import jpaapp.utility.HibernateUtility;

public class JPAMainApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Department dept = session.find(Department.class, 2);
	
		Department depart = new Department();	
		depart.setDeptName("IT");
		
		Employee emp = new Employee();
		emp.setFirstName("Sachin");
		emp.setLastName("Kumar");
		emp.setSalary(9811115.55);
		emp.setDepartment(depart);
		
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Manish");
		emp1.setLastName("Kumar");
		emp1.setSalary(918444.55);
		emp1.setDepartment(dept);
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		
		Set<Employee> empSet1 = new HashSet<Employee>();
		empSet1.add(emp);
		
		
		dept.setEmployees(empSet);
		depart.setEmployees(empSet1);
		session.persist(dept);
		session.persist(depart);
		/**
		//Find 
		Employee employee = session.find(Employee.class, 4);
		System.out.println(employee);
	**/
		session.getTransaction().commit();
	}

}
