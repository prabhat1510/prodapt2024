package springcoreexamples.dependencyinjection;

public class DIDemo {

	public static void main(String[] args) {
		
		IAddress iAddr = new Address();
		Customer cust = new Customer(iAddr);//Constructor Based Dependency Injected
		
		CustomerSetter custSetter = new CustomerSetter();
		custSetter.setIaddress(iAddr);//Setter Based Dependency Injected
	}

}
