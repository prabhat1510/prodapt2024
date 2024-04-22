package multithreadedingexample;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Thread myThread = new MyThread();//object of user defined thread class
		myThread.start();//by invoking or calling start method we running our thread
		//Information about your thread
		System.out.println(myThread.currentThread().getName());
		System.out.println(myThread.getName());//Thread-0
		System.out.println(myThread.getPriority());
		System.out.println(myThread.getState());
		System.out.println(myThread.getThreadGroup());
		
		
		
		
		
		
	}
	
}
