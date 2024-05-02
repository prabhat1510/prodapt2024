package jpaassociationexample.js;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class JSDemo {

	public static void main(String[] args) {
		
		EmployeeJS e1 = new EmployeeJS();
		e1.setName("Smith");
		e1.setSalary(67865.50);
		
		ManagerJS m1 =new ManagerJS();
		m1.setDepartmentName("Accounts");
		m1.setName("Ravi Kumar");
		m1.setSalary(123456.00);
		
		Session session= HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(e1);
		session.persist(m1);
		session.getTransaction().commit();

	}

}
