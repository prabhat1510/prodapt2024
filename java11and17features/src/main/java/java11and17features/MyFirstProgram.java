package java11and17features;

//import java11and17features.Customer;
public class MyFirstProgram {
/**
 * 
 * Execute Java File Without Compilation
 * Old way compiling and executing your java program
 * 
 * javac MyFristProgram.java
 * MyFirstProgram.class file will be generated
 * java MyFirstProgram
 * We get desired output
 * 
 * In Java 11 we just need to run 
 * java MyFirstProgram
 * 
 */
	public static void main(String[] args) {
		System.out.println("Running java files using java command");
		Customer cust = new Customer();
		cust.setCustId(1);
		System.out.println(cust);
	}

}

/**
class Customer {
	
	private Integer custId;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId) {
		this.custId = custId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	
}
*/