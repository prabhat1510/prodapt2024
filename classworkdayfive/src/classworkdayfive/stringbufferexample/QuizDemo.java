package classworkdayfive.stringbufferexample;

public class QuizDemo {

	public static void main(String[] args) {
		String st = new String("abc Technologies");
		StringBuffer sb = new StringBuffer("abc Technologies");
		String result1 = st.substring(6,12);//start index 6 endindex (12-1) 
		String result2 = sb.substring(6);
		String result3 = sb.substring(6,12);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
