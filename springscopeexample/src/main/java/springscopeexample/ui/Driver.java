package springscopeexample.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springscopeexample.bean.CustomerService;

public class Driver {

	public static void main(String[] args) {
		//Read the config file and create context
		//getBean
		AbstractApplicationContext context = 
	    		new ClassPathXmlApplicationContext(new String[] {"springconfig.xml"});
		System.out.println("********************Scope = prototype Example******************");
	    	CustomerService custA = (CustomerService)context.getBean("customerService");
	    	custA.setMessage("Message by custA");
	    	System.out.println("Message : " + custA.getMessage());
	    	System.out.println(custA.hashCode());
	    	
	    	//retrieve it again
	    	CustomerService custB = (CustomerService)context.getBean("customerService");
	    	System.out.println("Message : " + custB.getMessage());
	    	System.out.println(custB.hashCode());
	    	
	    	System.out.println("********************Default Scope Example******************");
	    	CustomerService custC = (CustomerService)context.getBean("customerServ");
	    	custC.setMessage("Message by custC");
	    	System.out.println("Message : " + custC.getMessage());
	    	System.out.println(custC.hashCode());
	    	
	    	//retrieve it again
	    	CustomerService custD = (CustomerService)context.getBean("customerServ");
	    	System.out.println("Message : " + custD.getMessage());
	    	System.out.println(custD.hashCode());
	}

}
