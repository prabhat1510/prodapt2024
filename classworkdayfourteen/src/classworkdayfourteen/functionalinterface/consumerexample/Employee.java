package classworkdayfourteen.functionalinterface.consumerexample;

import java.time.LocalDate;

public class Employee {
	private Integer empId;
	private String empName;
	private LocalDate dateOfBirth;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, LocalDate dateOfBirth) {
		this.empId = empId;
		this.empName = empName;
		this.dateOfBirth = dateOfBirth;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
