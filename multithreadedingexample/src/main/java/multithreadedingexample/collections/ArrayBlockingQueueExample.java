package multithreadedingexample.collections;

import java.util.Deque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queueNum = new ArrayBlockingQueue<Integer>(5);
		queueNum.add(10);
		queueNum.add(12);
		queueNum.add(13);
		queueNum.add(14);
		queueNum.add(15);
		//queueNum.add(16);//throw exception
		queueNum.forEach(System.out::println);
		
		System.out.println("********************************************************");
		Deque<String> dqueue = new ConcurrentLinkedDeque<String>();
		dqueue.add("DMK");
		dqueue.add("AIDMK");
		dqueue.add("PMK");
		dqueue.add("CMK");
		dqueue.add("MMK");
		dqueue.add("SMK");
		dqueue.forEach(System.out::println);
		System.out.println("********************************************************");
		dqueue.addFirst("PPMK");
		dqueue.addLast("BMK");
		dqueue.forEach(System.out::println);
		System.out.println("***********************Remove*********************************");
		dqueue.remove();//First element will be removed
		dqueue.removeFirst();
		dqueue.removeLast();
		dqueue.removeIf((s)->s.equals("BJP"));//remove elements if condition matches
		dqueue.removeFirstOccurrence("Modi");//First occurrence of the element will be removed
		dqueue.removeLastOccurrence("Narendra");
		dqueue.forEach(System.out::println);
	}

}
