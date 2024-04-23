package multithreadedingexample.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) {
		//Implementation of call method of Callable interface
		Callable<String> callable =()->buildPatientReport();
		
		//Creating a thread pool of 5 threads using Executors.newFixedThreadPool
		ExecutorService execService = Executors.newFixedThreadPool(5);
		
		//Submitting the callable task to executorservice which is responsible 
		//for running threads and returning the result 
		//to main thread in the form of Future object
		Future<String> result = execService.submit(callable);
		
		String message;
		try {
			//Retrieving the returned result by threads from Future object
			message = result.get();
			System.out.println(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static String buildPatientReport() {
		// TODO Auto-generated method stub
		return "Patient Report Generated";
	}
}
