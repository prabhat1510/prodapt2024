package classworkdayone;

public class EmployeeDemo {

	public static void main(String[] args) {
			//invoke no arg constructor
			Employee employee = new Employee();
			System.out.println(employee);
			employee.setEmpId(1);
			employee.setSalary(15000.00);
			employee.setAddress("Chennai");
			
			System.out.println(employee);
			System.out.println(employee.getAddress());
			System.out.println(employee.getEmpId());
			System.out.println(employee.getSalary());
			
			System.out.println("**************************");
			//Use of Parameterized Constructor
			Employee employee1 = new Employee(2,11000.0,"Hyderabad");
			System.out.println(employee1);
			System.out.println(employee1.getSalary());
			double increaseSalary= employee1.getSalary()*2;
			employee1.setSalary(increaseSalary);
			
			System.out.println(Employee.officeLocation);
			System.out.println(employee.officeLocation);
			System.out.println(employee1.officeLocation);
			System.out.println("**************************************");
			
			//Accessing static method
			Employee.displayOfficeLocation();//Accessing static method 
			employee.displaySalary();//Non static method 
			employee1.displaySalary();//Non static method 
	}

}
