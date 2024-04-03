package classworkdayeleven.mapexample;

import java.time.LocalDate;

public class Person {
	private String name;
	private String fatherName;
	private String motherName;
	private LocalDate dateOfBirth;
	//HAS-A relationship
	private Address address;
	private SSN ssn;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String fatherName, String motherName, LocalDate dateOfBirth, Address address, SSN ssn) {
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SSN getSsn() {
		return ssn;
	}
	public void setSsn(SSN ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", ssn=" + ssn + "]";
	}
}
