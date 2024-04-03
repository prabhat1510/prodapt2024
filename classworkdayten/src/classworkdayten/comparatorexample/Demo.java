package classworkdayten.comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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
		/**
		Set<Employee> setOfEmployees = new TreeSet<Employee>();
		setOfEmployees.add(emp2);
		setOfEmployees.add(emp3);
		setOfEmployees.add(emp6);
		setOfEmployees.add(emp5);
		setOfEmployees.add(emp1);
		setOfEmployees.add(emp4);
		
		Iterator itr = setOfEmployees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}**/
		System.out.println("*******************List of Set*****************************");
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp6);
		listOfEmployees.add(emp5);
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp4);
		Collections.sort(listOfEmployees, new NameComparator());
		Iterator itrs = listOfEmployees.iterator();
		while(itrs.hasNext()) {
			System.out.println(itrs.next());
		}
		
		listOfEmployees.sort(new SalaryComparator());
		//Since java 1.8 - no need to create a Custom Comparator class
		//Here we are passing the Employee class property salary's method 
		// reference in Comparator.comparing method 
		Collections.sort(listOfEmployees, Comparator.comparing(Employee::getSalary));
	}

}
