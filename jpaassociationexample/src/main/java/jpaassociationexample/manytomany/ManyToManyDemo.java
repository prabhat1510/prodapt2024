package jpaassociationexample.manytomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpaassociationexample.utilities.HibernateUtility;

public class ManyToManyDemo {

	public static void main(String[] args) {
		Order o1 = new Order();
		o1.setOrderDate(new Date());
		Order o2 = new Order();
		o2.setOrderDate(new Date());
		
		Product p1 = new Product();
		p1.setProductName("Apple iPhone 13 Pro Max");
		p1.setPrice(135600.00);
		Product p2 = new Product();
		p2.setProductName("Apple iPhone 13 Pro");
		p2.setPrice(125600.00);
		Set<Product> productSet1 = new HashSet<Product>();
		productSet1.add(p1);
		productSet1.add(p2);
		o1.setProducts(productSet1);
		
		Set<Product> productSet2 = new HashSet<Product>();
		productSet2.add(p1);
		productSet2.add(p2);
		o2.setProducts(productSet2);
		
		Session session= HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(o1);
		session.persist(o2);
		session.getTransaction().commit();
	}

}
