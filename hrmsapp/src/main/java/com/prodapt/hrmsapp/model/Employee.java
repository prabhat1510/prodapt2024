package com.prodapt.hrmsapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private Integer empId;
	private String empName;
	// HAS-A Relationship
	private Department department;
	private Double salary;
	private Integer age;
	private String jobTitle;

}
