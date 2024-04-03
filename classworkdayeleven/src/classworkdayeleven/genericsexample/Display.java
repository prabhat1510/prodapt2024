package classworkdayeleven.genericsexample;

import java.util.Collection;

public class Display {
	
	public void display(Collection<?> c) {
		for(Object e : c) {
			System.out.println(e);
		}
	}
	public void displayInteger(Collection<Integer> c) {
		for(Object e : c) {
			System.out.println(e);
		}
	}
}
