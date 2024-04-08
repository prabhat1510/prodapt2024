package classworkdayfourteen.functionalinterface.consumerexample;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerAnotherExample {

	public static void main(String[] args) {
		/**
		 * We have to calculate age of an employee and store it in a 
		 * map with key as employee object and value as age
		 * 1. Data employee objects
		 * 2. Write a logic to calculate age
		 * 3. Store it in a map
		 * 4.Using BiConsumer print employee id and age 
		 */
		
		//Step 1 
		Employee emp1 = new Employee(1,"Arthi",LocalDate.of(2002, 11, 16));
		Employee emp2 = new Employee(2,"Himangi",LocalDate.of(2003, 10, 18));
		Employee emp3 = new Employee(3,"Raj Rajeshwari",LocalDate.of(2000, 5, 26));
		Employee emp4 = new Employee(4,"Mahi",LocalDate.of(2004, 9, 1));
		Employee emp5 = new Employee(5,"Gokul",LocalDate.of(2002, 5, 6));
		Employee emp6 = new Employee(6,"Roshika",LocalDate.of(2003, 2, 21));
		Employee emp7 = new Employee(7,"Jay Lakshmi",LocalDate.of(2001, 4, 29));
		Employee emp8 = new Employee(8,"RajLakshmi",LocalDate.of(2004,7, 15));
		
		//Step 2 and Step 3
		Map<Employee,Integer> empAgeMap = new HashMap<Employee,Integer>();
		empAgeMap.put(emp8, calculateAge(emp8.getDateOfBirth()));
		empAgeMap.put(emp7, calculateAge(emp7.getDateOfBirth()));
		empAgeMap.put(emp6, calculateAge(emp6.getDateOfBirth()));
		empAgeMap.put(emp5, calculateAge(emp5.getDateOfBirth()));
		empAgeMap.put(emp4, calculateAge(emp4.getDateOfBirth()));
		empAgeMap.put(emp3, calculateAge(emp3.getDateOfBirth()));
		empAgeMap.put(emp2, calculateAge(emp2.getDateOfBirth()));
		empAgeMap.put(emp1, calculateAge(emp1.getDateOfBirth()));
		System.out.println(empAgeMap);
		
		//Step 4
		System.out.println("*******************************************************");
		BiConsumer<Employee,Integer> biCons = 
				(k,v)->System.out.println("Employee id "+k.getEmpId()+" : age is "+v);
		empAgeMap.forEach(biCons);

		
	}
	private static Integer calculateAge(LocalDate dateOfBirth) {
		LocalDate currentDate = LocalDate.now();
		Integer age = Period.between(dateOfBirth, currentDate).getYears();
		return age;
	}

}
