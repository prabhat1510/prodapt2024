package classworkdaynine.collections.listexample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(155);
		linkedList.add(1551);
		linkedList.add(55);
		linkedList.add(551);
		linkedList.add(115);
		//linkedList.addFirst(11);
		//linkedList.addLast(null);
		System.out.println(linkedList);
		System.out.println(linkedList.get(2));
	}
}
