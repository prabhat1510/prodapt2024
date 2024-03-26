package classworkdaythree.inheritances;

//POJO class -- Plain Old Java Object class
public class Employee {
	//Properties of Employee class
	//Or
	//Fields or Data members or Attributes of Employee class
	private int empId;
	private double salary;
	private String address;
	public static String officeLocation="IITM Research Park";
	
	//No Argument Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Employee(int empId, double salary, String address) {
		this.empId = empId;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(int empId, double salary) {
		this.empId = empId;
		this.salary = salary;

	}

	public Employee(double salary) {
		this.salary = salary;

	}
	//Accessor methods or Getter/Setter Methods
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	public static void displayOfficeLocation() {
		System.out.println(officeLocation);
	}
	
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}

