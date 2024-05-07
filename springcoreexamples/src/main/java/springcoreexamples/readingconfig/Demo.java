package springcoreexamples.readingconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Address addr = new Address(); System.out.println(addr);
		 * System.out.println("*************************"); addr.setAddressId(1);
		 * addr.setCity("Chennai"); addr.setCountry("India");
		 * addr.setState("Tamil Nadu"); System.out.println(addr);
		 * System.out.println("*************************"); Customer cust = new
		 * Customer(); System.out.println(cust);
		 * System.out.println("*************************"); Customer custP = new
		 * Customer(1,"Sai",addr); System.out.println(custP);
		 */

		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);

		// Here using context.getBean method we are trying to get instance of Customer
		// class
		Customer cust = context.getBean("customer", Customer.class);
		// Using cust object/bean instance we are accessing the object method
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getHomeAddress().getCity());
		System.out.println(cust.getResAddress().getCity());
		context.close();
		System.out.println("******BeanFactory is an implementation of Spring Container************");
		BeanFactory factory = new ClassPathXmlApplicationContext(springConfigurationFile);
		Person person = factory.getBean("person",Person.class);
		System.out.println(person);
		Person person1 = factory.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println("******Reading data from data.properties file********");
		Person person2 = factory.getBean("person2",Person.class);
		System.out.println(person2);
		
		
	}

}
