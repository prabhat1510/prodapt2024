package classworkdaythirteen.supplierexample;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//Using lambda expression we are implementing 
		//Supplier Functional Interface 
		Supplier<? extends Employee> s = ()->new Employee("Rakesh");
		
		Employee emp2= s.get();
		
		System.out.println("**********************");
		System.out.println(emp2.getName());
		
		Supplier<? extends Integer> sInt =()->Integer.valueOf(15);
		System.out.println(sInt.get());//print 15
		
		BooleanSupplier sBool =()->true;
		System.out.println(sBool.getAsBoolean());//print true

	}

}
