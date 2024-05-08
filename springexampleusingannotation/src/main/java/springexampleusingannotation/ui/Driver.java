package springexampleusingannotation.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexampleusingannotation.config.AppConfig;
import springexampleusingannotation.model.Address;
import springexampleusingannotation.model.Customer;
import springexampleusingannotation.model.Person;

public class Driver {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Address resiAdd = context.getBean("addressBean1",Address.class);
		System.out.println("Got residential address "+resiAdd.getCity());
		Customer cust = context.getBean("customer",Customer.class);
		System.out.println("Got customer " + cust.getCustomerName());
		
		Person personBean = context.getBean("person",Person.class);
		System.out.println("Got Person "+personBean.getPersonName());
	}
}
