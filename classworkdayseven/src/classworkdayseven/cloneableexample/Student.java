package classworkdayseven.cloneableexample;

public class Student implements Cloneable {
	private Integer studentId;
	private String studentName;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student cloneTest() throws CloneNotSupportedException {
		Object obj = super.clone();
		Student student = (Student)obj;
		return student;
		//return (Student) super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
