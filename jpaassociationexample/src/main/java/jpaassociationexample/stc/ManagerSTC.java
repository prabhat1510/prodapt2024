package jpaassociationexample.stc;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Table(name = "manager_stc")
@DiscriminatorValue("MGR")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ManagerSTC extends EmployeeSTC {
	private String departmentName;

}
