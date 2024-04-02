package classworkdaynine.collections.comparatorexample;

import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11,"Nitin",11111);
		Employee emp2 = new Employee(12,"Kunal",12111);
		Employee emp3 = new Employee(13,"Balaji",11211);
		Employee emp4 = new Employee(14,"Arthi",11412);
		Employee emp5 = new Employee(15,"Jyoti",12514);
		Employee emp6 = new Employee(16,"Jayavarshini",16215);
		
		Set<Employee> setOfEmployees = new TreeSet<Employee>();
		setOfEmployees.add(emp2);
		setOfEmployees.add(emp3);
		setOfEmployees.add(emp6);
		setOfEmployees.add(emp5);
		setOfEmployees.add(emp1);
		setOfEmployees.add(emp4);
	}

}
