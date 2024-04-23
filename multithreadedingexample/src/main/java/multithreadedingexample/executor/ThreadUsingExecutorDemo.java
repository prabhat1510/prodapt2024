package multithreadedingexample.executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadUsingExecutorDemo {

	public static void main(String[] args) {
		/**
		 * 1.A task is an instance of Runnable 2.The Thread is launched 3.The Thread is
		 * created on demand by user 4.Once the task is done ,thread dies. 5.Threads are
		 * expensive resource
		 **/
		// Implementation of run method of Runnable
		Runnable task = () -> System.out.println("Kalaai Vanakkam Mr Thread :) ");
		Thread t = new Thread(task);

		System.out.println(t.getName());
		System.out.println(t.getState());
		t.start(); // start the thread t
		System.out.println(t.getState());

		System.out.println("*************************************************************");
		// Create a pool with only one thread in it
		Executor executor = Executors.newSingleThreadExecutor();
		Runnable task2 = () -> System.out.println("I Run");
		executor.execute(task2);

		ThreadA threadA = new ThreadA();
		Thread th = new Thread(threadA);
		executor.execute(th);

		System.out.println("*************************************************************");
		// This will create a pool with only one thread in it
		// A pool of Thread is an instance of Executor Interface
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		singleThreadExecutor.execute(th);

		// Creates a pool with 8 threads
		ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(8);

		Runnable task3 = () -> System.out.println("Some really long process");
		Runnable task4 = () -> System.out.println("Another really long process");

		singleThreadExecutor.execute(task3);
		singleThreadExecutor.execute(task4);

		// Get ExecutorService from Executors utility class, thread pool size is 10
		ExecutorService exec = Executors.newFixedThreadPool(10);
		System.out.println(exec.isShutdown());
		System.out.println(exec.isTerminated());

		// Create MyCallable instance
		Callable<String> callable = new MyCallable();

		//create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        
		for (int i = 0; i < 100; i++) {
			// submit Callable tasks to be executed by thread pool
			Future<String> future = exec.submit(callable);
			// add Future to the list, we can get return value using Future
			list.add(future);
		}
		
		for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System .out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        exec.shutdown();
		
	}

}
