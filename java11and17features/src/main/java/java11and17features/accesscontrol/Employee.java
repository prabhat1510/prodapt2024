package java11and17features.accesscontrol;

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
	private Integer id;
	private String name;
	
	public void displayEmployeeName() {
		System.out.println(this.getName());
	}
}
