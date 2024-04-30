package jpaassociationexample.onetooneuni;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class OneToOneUniDemo {

	public static void main(String[] args) {
		Session session= HibernateUtility.getSessionFactory().openSession();
		Student student = new Student();
		Address homeAddress = new Address();
		
		student.setStudentName("Suman Sarkar");
		homeAddress.setCity("Kolkatta");
		homeAddress.setState("West Bengal");
		homeAddress.setStreet("New Town");
		homeAddress.setZipCode("330001");
		//inject address into student
		student.setAddress(homeAddress);
		
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
	}

}
