package java11and17features.accesscontrol;

import java11and17features.accesscontrol.AnotherDemo.NestedClass;

public class AnotherDemoMain {

	public static void main(String[] args) {
		System.out.println(AnotherDemo.class.getCanonicalName());
		System.out.println(AnotherDemo.class.getName());
		System.out.println(AnotherDemo.class.getPackageName());
		System.out.println(AnotherDemo.class.getSimpleName());
		System.out.println(AnotherDemo.class.isMemberClass());
		System.out.println(AnotherDemo.NestedClass.class.isMemberClass());
		System.out.println(AnotherDemo.class.isNestmateOf(NestedClass.class));
		System.out.println(NestedClass.class.isNestmateOf(AnotherDemo.class));

		System.out.println("******************************************************");
		System.out.println(AnotherDemo.class.getNestHost());
		System.out.println(NestedClass.class.getNestHost());

		System.out.println("******************************************************");
		// Nest host of Demo class
		System.out.println(AnotherDemo.class.getNestMembers());
		System.out.println(AnotherDemo.NestedClass.class.getMethods()[0]);
		System.out.println("******************************************************");
		System.out.println(AnotherDemo.class.getConstructors());
		System.out.println("**********************Creating object using new********************************");
		AnotherDemo anDemo = new AnotherDemo();
		anDemo.setMessage("Hello");
		System.out.println(anDemo.getMessage());
		
		
		AnotherDemo nestedDemo = new AnotherDemo();//Object of top level class
		AnotherDemo.NestedClass nDemo = nestedDemo.new NestedClass();//Object of inner class
		nDemo.callPrivateMethod();
		nestedDemo.setMessage("Bye Bye !!!");
		System.out.println(nestedDemo.getMessage());
		
		
	}

}
