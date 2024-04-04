package studentassignment.model;

public class Student {
	// Properties of Student class
	private Integer id;
	private String name;
	private String city;

	// Create Constructor No Arg
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Create Constructor with all Arg
	public Student(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	// Getter and Setter Methods
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// ToString methods
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
