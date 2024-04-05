package classworkdaythirteen.functionalinterfaceexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		//List of number 
		List<Integer> listOfNumber = Arrays.asList(2,3,1,4,5,6,7);
		//Using forEach i want to print the numbers
		System.out.println("*********************************");
		listOfNumber.forEach((n)->System.out.println(n));
		System.out.println("*********************************");
		
		//Check odd and even from a collection using lambda expression
		listOfNumber.forEach((n)->{
			if(n%2 == 0) {
				System.out.println(n+" is an even number");
			}else {
				System.out.println(n+" is an odd number");
			}
		});
		
		System.out.println("*********************************");
		listOfNumber.forEach(System.out::println);
		
		System.out.println("**************Sorting elements of collection using lambda*******************");
		Office office = new Office();
		office.setOfficeId(1);
		office.setBlock("A");
		office.setBuildingName("IITM Research Park");
		office.setCity("Chennai");
		office.setArea("Taramani");
		
		Office office1 = new Office();
		office1.setOfficeId(2);
		office1.setBlock("Fidelity Block");
		office1.setBuildingName("Ramanujan SEZ");
		office1.setCity("Chennai");
		office1.setArea("Taramani");
		
		Office office2 = new Office();
		office2.setOfficeId(3);
		office2.setBlock("Industrial Estate");
		office2.setBuildingName("Guindy IE");
		office2.setCity("Chennai");
		office2.setArea("Guindy");
		
		Office office3 = new Office();
		office3.setOfficeId(4);
		office3.setBlock("Jupiter");
		office3.setBuildingName("IPTL");
		office3.setCity("BLR");
		office3.setArea("Whitefield");
		
		List<Office> officeList= new ArrayList<Office>();
		officeList.add(office3);
		officeList.add(office2);
		officeList.add(office1);
		officeList.add(office);
		System.out.println(officeList);
		System.out.println("*********Instead of custom comparator for block "
				+ "we are using lambda***********************************");
		Collections.sort(officeList, Comparator.comparing(
						(o)->o.getBlock())
				);
		System.out.println("********************************************");
		System.out.println(officeList);
		
		System.out.println("**********Instead of custom comparator for area we "
				+ "are using Method reference**********************************");
		Collections.sort(officeList, Comparator.comparing(Office::getArea));
		System.out.println("********************************************");
		System.out.println(officeList);
	}
}
