package multithreadedingexample.diffstates;

public class DiffStatesDemo {

	public static void main(String[] args) {
		//ThreadA tA = new ThreadA();
		//Thread t = new Thread(t);
		
		Thread t = new Thread(new ThreadA());
		System.out.println("State of the thread before calling start()--- "+t.getState());
		t.start();
		System.out.println("State of the thread after calling start()--- "+t.getState());
	}

}
