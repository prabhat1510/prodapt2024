package multithreadedingexample.diffstates;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Thread A class run method");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State of threadB while it called join() "
				+ "method on the threadA "+ThreadB.threadA.getState());
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
