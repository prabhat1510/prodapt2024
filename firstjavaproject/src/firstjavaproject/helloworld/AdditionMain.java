package firstjavaproject.helloworld;

public class AdditionMain {

	public static void main(String[] args) {
		//Creating an instance or object of 
		//Addition class by calling default
		//constructor
		
		Addition addition = new Addition();
		//Making a call to add method using 
		//addition class
		//object and returned result is assigned
		//to a variable result
		int result = addition.add(15, 10);
		//Printing the value of result variable 
		System.out.println(result);
		
		//System.out.println(addition.add_static(21, 10));
		System.out.println(Addition.add_static(21, 11));
		System.out.println(Addition.pi);
		//System.out.println(addition.pi);
	}

}
