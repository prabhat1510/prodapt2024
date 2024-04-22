package multithreadedingexample;

public class MyThreadUsingRunnable implements Runnable{
//public class MyThreadUsingRunnable extends SuperDemo implements Runnable{
	
	//Multiple inheritance is not supported in Java
	//public class MyThreadUsingRunnable extends SuperDemo extends Thread{

	@Override
	public void run() {
		System.out.println("I am into my thread using runnable run method");
		
	}

}
