package classworkdayeleven.mapexample;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SSNDemo {

	public static void main(String[] args) {
		
		Address homeAddress1= new Address();
		homeAddress1.setAddressId(1);
		homeAddress1.setState("TamilNadu");
		homeAddress1.setCity("Chennai");
		homeAddress1.setCountry("India");
		homeAddress1.setHouseNo("15");
		homeAddress1.setStreet("Kanagam Road");
		
		Address homeAddress2= new Address();
		homeAddress2.setAddressId(2);
		homeAddress2.setState("TamilNadu");
		homeAddress2.setCity("Chennai");
		homeAddress2.setCountry("India");
		homeAddress2.setHouseNo("16");
		homeAddress2.setStreet("Kanagam Road");
		
		Person person = new Person();
		person.setAddress(homeAddress2);
		person.setName("Vijay Joseph");
		person.setFatherName("Bill Joseph");
		person.setMotherName("Maria Joseph");
		person.setDateOfBirth(LocalDate.of(1980, 8, 15));
		SSN ssn = new SSN();
		//System.out.println(ssn.getSsn());
		person.setSsn(ssn);
		
		
		Person person1 = new Person();
		person1.setAddress(homeAddress1);
		person1.setName("Vijay Thalapathi");
		person1.setFatherName("Balajee Thalapathi");
		person1.setMotherName("Lakshi Thalapathi");
		person1.setDateOfBirth(LocalDate.of(1975, 6, 11));
		SSN ssn1 = new SSN();
		//System.out.println(ssn1.getSsn());
		person1.setSsn(ssn1);
		
		Map<SSN,Person> personMap = new HashMap<SSN,Person>();
		personMap.put(ssn1, person1);
		personMap.put(ssn, person);
		System.out.println(personMap);
		
		
	}

}
