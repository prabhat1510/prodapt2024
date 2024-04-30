package jpaassociationexample.tpc;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class TPCDemo {

	public static void main(String[] args) {
		
		EmployeeTPC e1 = new EmployeeTPC();
		e1.setName("Smith");
		e1.setSalary(67865.50);
		
		ManagerTPC m1 =new ManagerTPC();
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
