package multithreadedingexample.diffstates;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("My Runnable class - thread name is "+Thread.currentThread().getName());
		System.out.println("My Runnable class - thread state is "+Thread.currentThread().getState());
	}

}
