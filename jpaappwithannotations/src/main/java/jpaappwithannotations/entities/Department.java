package jpaappwithannotations.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findDepartmentByName",  
	        query = "from Department d where d.deptName = :name"  
	        )  
	    }  
	)  
//Persistence class
@Entity
@Table(name = "department_info")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "dept_no")
	private Integer deptNo;
	//@Column(name = "dept_name")
	private String deptName;

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

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

}
