package jpaassociationexample.js;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "manager_js")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ManagerJS extends EmployeeJS{
	private String departmentName;
}

