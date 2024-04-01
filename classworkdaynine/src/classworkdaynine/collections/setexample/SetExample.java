package classworkdaynine.collections.setexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(15);
		set.add(151);
		set.add(15);
		set.add(1511);
		set.add(215);
		System.out.println(set);
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(15);
		set1.add(151);
		set1.add(15);
		set1.add(1511);
		set1.add(215);
		//set1.add("Hi");//Compilation error as set will accept integers only
		System.out.println(set1);
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(15);
		set2.add(151);
		set2.add(15);
		set2.add(1511);
		set2.add(215);
		System.out.println(set2);
	}

}
