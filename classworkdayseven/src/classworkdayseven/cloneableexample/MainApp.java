package classworkdayseven.cloneableexample;

public class MainApp {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(15);
		student.setStudentName("Rishidhar MSR");
		
		System.out.println(student.hashCode());
		System.out.println(student);
		try {
			Student stu = student.cloneTest();
			System.out.println(stu.hashCode());
			System.out.println(stu);
		} catch (CloneNotSupportedException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	

}
