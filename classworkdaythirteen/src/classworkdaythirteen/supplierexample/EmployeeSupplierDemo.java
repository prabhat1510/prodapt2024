package classworkdaythirteen.supplierexample;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class EmployeeSupplierDemo {

	public static void main(String[] args) {
		//passing contructor reference to supplier factory
		//Employee emp = supplierFactory(Employee::new);
		//System.out.println(emp);
		
		//Lambda Expression
		Supplier<? extends Employee> s =()->new Employee("Rakesh");//Using lambda expression we are implementing Supplier Functional Interface 
		
		System.out.println("**************************");
		Employee emp1 = supplierFactory(s);//method called
		System.out.println(emp1);
	}

	
	//This is a higher order function or method which accepts as lambda expression as an argument
	public static Employee supplierFactory(Supplier<? extends Employee> s) {
		Employee employee= s.get();
		if(employee.getName() == null || "".equals(employee.getName())) {
			employee.setName("default");
		}
		employee.setSalary(BigDecimal.ONE);
		employee.setStartDate(LocalDate.of(2016, 10, 15));
		return employee;
	}

}

