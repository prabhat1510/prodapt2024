package jpaapp.entities;

import java.util.Set;

//Persistence Class
public class Department {
	private Integer deptNo;
	private String deptName;
	private Set<Employee> employees;
	
	
	//No-arg constructor
	public Department() {
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", employees=" + employees + "]";
	}


	
	
}
