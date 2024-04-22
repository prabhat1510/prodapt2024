package multithreadedingexample.diffstates;

public class ThreadB implements Runnable{
	public static Thread threadA;
	public static ThreadB threadB;
	
	public static void main(String[] args) {
		threadB = new ThreadB();
		threadA = new Thread(threadB);
		
		System.out.println("State of threadA after creating it ---- "+threadA.getState());
		threadA.start();
		System.out.println("State of threadA after calling .start()   "+threadA.getState());
		
	}
	@Override
	public void run() {
		
		System.out.println("Inside Thread B class run method");
		ThreadA myThread= new ThreadA();
		Thread threadB = new Thread(myThread);
		
		System.out.println("State of threadB after creating it ---- "+threadB.getState());
		threadB.start();
		System.out.println("State of threadB after calling .start()   "+threadB.getState());

		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State of threadB after calling .sleep() on it-    "+threadB.getState());
		
		try {
			threadB.join();//waiting for threadB to die
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("State of threadB when it has finished it's execution - "+threadB.getState());
	}

}
