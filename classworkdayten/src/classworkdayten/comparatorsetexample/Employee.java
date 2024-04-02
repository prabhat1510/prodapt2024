package classworkdayten.comparatorsetexample;

public class Employee{
	private Integer empId;
	private String empName;
	private Integer salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empId, String empName, Integer salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
}
