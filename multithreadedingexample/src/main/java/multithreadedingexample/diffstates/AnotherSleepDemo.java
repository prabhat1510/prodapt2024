package multithreadedingexample.diffstates;

public class AnotherSleepDemo {
	public static void main(String[] args) {
		
		SeasonThread st = new SeasonThread();
		Thread t = new Thread(st);
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
	}
}
