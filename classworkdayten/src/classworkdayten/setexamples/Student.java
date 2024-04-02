package classworkdayten.setexamples;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private Integer id;
	private String name;
	private LocalDate dateOfBirth;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, LocalDate dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		if (this.getId() == o.getId()) {
			return 0;
		} else {
			return this.getId() > o.getId() ? 1 : -1;
		}
	}

}
