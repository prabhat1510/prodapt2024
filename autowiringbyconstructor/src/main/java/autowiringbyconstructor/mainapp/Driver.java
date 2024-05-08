package autowiringbyconstructor.mainapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiringbyconstructor.beans.Employee;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee.getEmpName());		
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getState());
        context.close();

	}

}
