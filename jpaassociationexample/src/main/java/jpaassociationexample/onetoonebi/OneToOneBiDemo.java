package jpaassociationexample.onetoonebi;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class OneToOneBiDemo {

	public static void main(String[] args) {
		Session session= HibernateUtility.getSessionFactory().openSession();
		StudentBi studentBi = new StudentBi();
		AddressBi homeAddressBi = new AddressBi();
		
		studentBi.setStudentName("Suman Sarkar");
		homeAddressBi.setCity("Kolkatta");
		homeAddressBi.setState("West Bengal");
		homeAddressBi.setStreet("New Town");
		homeAddressBi.setZipCode("330001");
		
		//inject address into student
		studentBi.setAddressBi(homeAddressBi);
		homeAddressBi.setStudentBi(studentBi);
		
		session.beginTransaction();
		session.persist(studentBi);
		session.getTransaction().commit();

	}

}
