package classworkdayfive.stringbufferexample;

public class SBDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Kalai Vanakkam");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(14, " ");
		System.out.println(sb);
		sb.insert(15,"Amrita");
		System.out.println(sb);
		sb.insert(6," Hello ");
		System.out.println(sb);
		sb.delete(6, 12);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
