package multithreadedingexample;

public class MyThreadUsingRunnableDemo {

	public static void main(String[] args) {
		//Object of custom thread class
		MyThreadUsingRunnable th = new MyThreadUsingRunnable();
		Thread t = new Thread(th);//Pass the above object reference to Thread constructor
		System.out.println("State of thread before calling the start ---"+t.getState());
		t.start(); //Call the run method or start the thread
		
		System.out.println("Name of the thread---"+t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.isVirtual());//Java version 21
		System.out.println(t.isInterrupted());
		System.out.println("Priority of thread --- "+t.getPriority());
		t.setName("IITMRP Thread");
		System.out.println("Name of the current Thread --- "+t.currentThread().getName());
		System.out.println("Name of the thread --- "+t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());
		
		
		
		
		
		
	}

}
