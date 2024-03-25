package classworkdayfour.interfaces;

public class InheritanceDemo {

	public static void main(String[] args) {
		A s1 = new A();//Base class object
		B s2 = new B();//Derived class object
		
		//s1.m = 10; 
		//s1.n = 20;
		s1.setM(10);
		s1.setN(20);
		System.out.println("State of object A:");
		s1.display1();  	

		s2.setM(7); 
		s2.setN(8); 
		s2.setC(9);
		System.out.println("State of object B:");
		s2.display1();	 
		s2.display2();
		System.out.println("sum of m, n and c in object B is:");
		s2.sum();
	}
}
