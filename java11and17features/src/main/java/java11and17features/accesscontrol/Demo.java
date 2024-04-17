package java11and17features.accesscontrol;

/**
 * 
 * Reflection is a feature in the Java language.
 * It allows an executing Java program to examine or "introspect" upon iteself,and 
 * manipulate internal properties of the program.
 *
 */

//Top Level Class
public class Demo {
	//Method of Demo class
	private void privateMethod() {
		System.out.println("I am a private method");
	}
	
	//Inner class of Demo or Nested class
	class NestedClass{
		public void callPrivateMethod() {
			privateMethod();
		}
	}
	
	
	public static void main(String[] args) {
		//Here Demo class is a nestmate of NestedClass
		System.out.println(Demo.class.isNestmateOf(Demo.NestedClass.class));
		
		System.out.println(Demo.NestedClass.class.isNestmateOf(Demo.class));
		//Nest host of NestedClass
		System.out.println(Demo.NestedClass.class.getNestHost());
		
		//Nest host of Demo class
		System.out.println(Demo.class.getNestMembers());
		System.out.println(Demo.NestedClass.class.getMethods()[0]);
	}

}
