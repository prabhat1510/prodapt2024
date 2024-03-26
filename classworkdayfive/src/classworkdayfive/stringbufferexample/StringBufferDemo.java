package classworkdayfive.stringbufferexample;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Vanakkam");
		
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println("*************************************");
		System.out.println(sb.length());
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println("*************************************");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		System.out.println(sb1.append(" All"));
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.append(" How are you"));
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println("*********************");
		System.out.println(sb1.append(" ?"));
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		StringBuffer sb3 = new StringBuffer("Vanakkam");
		System.out.println(sb3.hashCode());
		System.out.println(sb1.hashCode());
	}

}
