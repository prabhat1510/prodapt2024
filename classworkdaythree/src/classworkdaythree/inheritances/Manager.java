package classworkdaythree.inheritances;

import java.util.List;

public class Manager extends Employee{

	private String role;
	
	private List<Employee> reportees;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, double salary, String address) {
		super(empId, salary, address);
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, double salary) {
		super(empId, salary);
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	@Override
	public String toString() {
		return "Manager [role=" + role + ", reportees=" + reportees + "]";
	}
	
	
	
}
