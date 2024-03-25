package classworkdayfour.associaton;

public class MainApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustId(1);
		customer.setCustName("Billy");
		
		Address address = new Address();
		address.setAddressId(1);
		address.setHouseNo(1111);
		address.setCity("Chennai");
		address.setState("TN");
		address.setStreet("Kanagam Road");
		address.setCountry("IN");
		
		customer.setAddress(address);
		
		System.out.println(customer);

	}

}
