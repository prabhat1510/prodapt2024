package classworkdayfour.stringexamples;

public class StringAnotherDemo {

	public static void main(String[] args) {
						//	 012345678910111213	
		String helloWorld = "Hello World !!";
		System.out.println(helloWorld.length());
		System.out.println(helloWorld.charAt(10));
		
		System.out.println(helloWorld.indexOf('l'));//It will return first occurrence of character's index
		System.out.println("****************************************");
		for(int index=0;index<helloWorld.length();index++) {
			if((helloWorld.charAt(index))== 'l') {
				System.out.println(index);
			}
		}
		System.out.println("****************************************");
		
		String newString =helloWorld.concat(" \n World is very beautiful !!!");
		System.out.println(helloWorld);
		System.out.println(newString);
		
		System.out.println(helloWorld.hashCode());
		System.out.println(newString.hashCode());
		
		
		
		System.out.println("****************************************");
		String upperCase = helloWorld.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = helloWorld.toLowerCase();
		System.out.println(lowerCase);
		char [] arrayOfChar= helloWorld.toCharArray();
		System.out.println(arrayOfChar);
		System.out.println(arrayOfChar[2]);
		
		System.out.println("****************************************");
					//0123456	
		String month="January";
		System.out.println(month.startsWith("Jan"));
		System.out.println(month.endsWith("ry"));
		System.out.println("****************************************");
		System.out.println(month.substring(2));
		System.out.println(month.substring(2,5));
		System.out.println("****************************************");
		System.out.println(month.equals("January"));
		System.out.println(month.equalsIgnoreCase("january"));
		System.out.println("****************************************");
		String jan = "january";
		String janry="January";
		
		if(month == janry) {
			System.out.println("Both are same");
		}else if(month == jan) {
			System.out.println("Both are different");
		}else {
			System.out.println("I don't anything about it ");
		}
		System.out.println("******************************************");
		String january = new String("January");
		System.out.println((january==month));//Compares memory address
		System.out.println(january.equals(month));//Compares content
	}

}
