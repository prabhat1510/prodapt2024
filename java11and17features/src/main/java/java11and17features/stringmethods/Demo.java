package java11and17features.stringmethods;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		String blankString = "";
		String blkStr = "    ";
		if (blankString.isBlank()) {
			System.out.println("String is blank");
		}

		if (blkStr.isBlank()) {
			System.out.println("String is blank contains whitespaces");
		}

		// Old Way --- No need now onwards using isBlank method
		if (blankString.equals("")) {
			System.out.println("String is blank -- old way");
		}

		if (blkStr.isEmpty()) {
			System.out.println("blkStr is empty---");
		} else {
			System.out.println("Length of blkStr is ---" + blkStr.length());
			System.out.println("Length of blankString is ---" + blankString.length());
		}
		System.out.println("******************************************************************");
		String s1 = "";
		String s2 = "      ";
		String s3 = "Hello";
		// isBlank()
		System.out.println("s1 is blank : " + s1.isBlank());
		System.out.println("s2 is blank : " + s2.isBlank());
		System.out.println("s3 is blank : " + s3.isBlank());

		System.out.println("******************************Lines************************************");
		// lines method - splits a string using line terminators and returns a stream
		// line terminators are new line feed- \n ,or carriage return \r
		// \n means new line -- It means that the cursor must go to the next line
		// \r means carriage return -- The cursor should go back to the beginning of the
		// line

		String str = "Hello ! \n How are you ?\nNew String method\rdemo";
		System.out.println(str);
		List<String> listOfLines = str.lines().collect(Collectors.toList());
		System.out.println(listOfLines);
		System.out.println("******************************************************");
		/**
		 * In windows Carriage Return i.e. CR (\r) and 
		 * the \n (Line Feed or LF) both are there
		 * It means \r  and \n is a combination \r\n
		 * 
		 * In UNIX only \n or new line feed
		 */
		System.out.println("Hi");
		System.out.println("Hi\n");
		System.out.println("Hi\r");
		System.out.println("Hi\r\n");
		System.out.println("**************************repeat****************************");
		//repeat() - this method is used to duplicate or repeat a string
		String hi = "Hello";
		
		System.out.println(hi);
		System.out.println(hi.repeat(2));
		System.out.println(hi.repeat(4));
		System.out.println("*********************strip(), stripLeading(), stripTrailing()*********************************");
		/**
		 * strip(), stripLeading(), stripTrailing()
		 */
		
		String greetings = " Hello Everyone ";
		System.out.println(greetings.strip());
		System.out.println(greetings.stripLeading());
		System.out.println(greetings.stripTrailing());
	}
}
