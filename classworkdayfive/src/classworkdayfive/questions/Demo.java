package classworkdayfive.questions;

public class Demo {

	public static void main(String[] args) {
		// Q1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//	
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Able was I ere I saw Elba.");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
