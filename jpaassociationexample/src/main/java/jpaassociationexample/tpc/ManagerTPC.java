package jpaassociationexample.tpc;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "manager_tpc")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ManagerTPC extends EmployeeTPC{

	private String departmentName;
}
