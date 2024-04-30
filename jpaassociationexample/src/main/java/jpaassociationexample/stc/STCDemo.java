package jpaassociationexample.stc;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class STCDemo {

	public static void main(String[] args) {
		EmployeeSTC e1 = new EmployeeSTC();
		e1.setName("Smith");
		e1.setSalary(67865.50);

		ManagerSTC m1 = new ManagerSTC();
		m1.setDepartmentName("Accounts");
		m1.setName("Ravi Kumar");
		m1.setSalary(123456.00);
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(e1);
		session.persist(m1);
		session.getTransaction().commit();
	}

}
