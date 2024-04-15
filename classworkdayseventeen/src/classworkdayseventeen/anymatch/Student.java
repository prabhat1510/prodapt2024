package classworkdayseventeen.anymatch;

import java.time.LocalDate;
import java.util.List;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private List<Course> courses;
	private LocalDate dateOfBirth;
	public Student(Integer id, String name, Integer age, List<Course> courses, LocalDate dateOfBirth) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.courses = courses;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
