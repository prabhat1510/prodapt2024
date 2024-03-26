package classworkdayfour.stringexamples;

public class StringDemo {

	public static void main(String[] args) {
		String s = new String();
		String s1 = "Hello";
		String s2 = new String("How are you ?");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3 ="Hello";
		System.out.println(s3.hashCode());
		System.out.println("*********************************");
		s="World";
		s1="Fire Fire !!!";
		s2="Run leave Java Programming";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("*********************************");
		char data[]= {'a','b','c'};
		String strData= new String(data);
		System.out.println(strData);
		
		
		
		
		
		
		
		

	}

}
