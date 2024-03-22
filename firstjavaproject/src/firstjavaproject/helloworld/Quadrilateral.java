package firstjavaproject.helloworld;

public abstract class Quadrilateral {
	private Integer base;
	private Integer height;

	// Default Constructor
	public Quadrilateral() {
		// TODO Auto-generated constructor stub
	}

	public Quadrilateral(Integer base, Integer height) {
		this.base = base;
		this.height = height;
	}

	// Parameterized constrcutor

	// abstract method
	public abstract Integer area();

	// Getter and Setter methods
	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

}
