package classworkdaynine.collections.listexample;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vec= new Vector();
		System.out.println(vec.capacity());//Default capacity 10
		vec.add(15);
		vec.add("Hello");
		vec.add(151);
		vec.add("Hello World");
		vec.add(152);
		vec.add("Hello Everyone");
		vec.add(15111);
		vec.add("Hellooooooooooo");
		vec.add(151);
		vec.add("Hello World");
		vec.add(152222222);
		vec.add("Hello Everyoneeeeeeeeeeeee");
		System.out.println(vec.capacity());
		Vector<Integer> v = new Vector<Integer>();
		v.add(11);
		v.add(13);
		v.add(12);
		v.add(14);
		v.add(21);
		v.add(10);
		System.out.println(v);
		System.out.println("********************************");
		for(Integer i : v) {
			System.out.println(i);
		}
		Collections.sort(v);
		System.out.println(v);
		Collections.reverse(v);
		System.out.println(v);
		
	}
}
