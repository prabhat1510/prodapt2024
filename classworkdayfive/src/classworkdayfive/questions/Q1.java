package classworkdayfive.questions;

public class Q1 {

	public static void main(String[] args) {
		//Q1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		//Q2 
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf('b'));
		//String st = "Was it a car or a cat I saw?";
		//st.subString(9,12);
		StringBuffer sb1 = new StringBuffer("Was it a car or a cat I saw?");
		String str=sb1.substring(9, 12);
		System.out.println(str);
	}

}
