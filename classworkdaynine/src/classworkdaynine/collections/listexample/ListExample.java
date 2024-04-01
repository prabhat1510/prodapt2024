package classworkdaynine.collections.listexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// languages is an arraylist object or instance
		// Below an arraylist object is created by invoking ArrayList() constructor
		// languages is a reference to an arraylist object.
		// Below created ArrayList container is going to store String type of object
		ArrayList<String> languages = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println(languages);
		System.out.println(numbers);
		System.out.println(languages.isEmpty());
		System.out.println(numbers.isEmpty());
		ArrayList language = new ArrayList();
		language.add("Tamil");
		language.add(112132);
		language.add("Telugu");
		System.out.println(language);
		System.out.println(language.isEmpty());
		
		List<String> books = new ArrayList<String>();
		books.add("Gone with the wind");
		books.add("Wings of Fire");
		books.add("Jungle Book");
		//books.add(154);//Compilation error as ArrayList is defined to store String type data 
		System.out.println(books);
		System.out.println("****************Classic For Loop*******************");
		//Accessing list element using index
		for(int index=0;index<books.size();index++) {
			System.out.println(books.get(index));
		}
		System.out.println(books.get(1));
		
		System.out.println("***************Advance for loop*******************");
		for(String book:books) {
			System.out.println(book);
		}
		System.out.println("************For Each***********************");
		//Here we are passing method reference of println method of System.out class
		books.forEach(System.out::println);
		System.out.println("************Using Iterator***********************");
		Iterator itr = books.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********************************************");
		String removedElement = books.remove(1);
		System.out.println(removedElement);
		System.out.println(books);
		System.out.println("*********************************************");
		books.add("Das Kapital");
		books.add("Jungle Book");
		System.out.println(books);
		boolean isRemoved =books.remove("Jungle Book");
		if(isRemoved) {
			System.out.println("Yes removed");
		}else {
			System.out.println("Unable to remove");
		}
		System.out.println(books);
	}

}
