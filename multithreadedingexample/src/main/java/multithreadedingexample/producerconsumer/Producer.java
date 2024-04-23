package multithreadedingexample.producerconsumer;

public class Producer extends Thread {
	private Factory factory;// Producer class has a relationship with Factory

	public Producer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		for (int i = 0; i < 11; i++) {
			factory.put(i);//write or produce the data through producer thread
		}
	}

}
