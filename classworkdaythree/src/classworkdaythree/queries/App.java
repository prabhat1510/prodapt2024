package classworkdaythree.queries;

public class App {

	public static void main(String[] args) {
		Customer cust1 = new Customer(1,"Supriya");
		Customer cust2 = new Customer(2,"Prasanna");
		Customer cust3 = new Customer(3,"Jyoti");
		Customer cust4 = new Customer(4,"Preeti");
		Customer cust5 = new Customer(5,"RajRajeshwari");
		Customer cust6 = new Customer(6,"Gokul");
		Customer cust7 = new Customer(7,"Himangi");
		Customer cust8 = new Customer(8,"Sivaraman");
		//Array of objects
		Object [] custObjs = new Object[8];
		
		custObjs[0]=cust1;
		custObjs[1]=cust2;
		custObjs[2]=cust3;
		custObjs[3]=cust4;
		custObjs[4]=cust5;
		custObjs[5]=cust6;
		custObjs[6]=cust7;
		custObjs[7]=cust8;
		//display customer objects
		display(custObjs);
	}

	private static void display(Object[] custObjs) {
		for(Object obj:custObjs) {
			System.out.println(obj);
		}
		
	}

	
}
