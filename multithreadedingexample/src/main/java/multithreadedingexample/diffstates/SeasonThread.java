package multithreadedingexample.diffstates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeasonThread implements Runnable{

	@Override
	public void run() {
		//Collection List is created to store seasons
				List<String> seasonList = new ArrayList<>();
				
				seasonList = Arrays.asList(new String[] { "Winter", "Summer", "Spring", "Autumn" });
				System.out.println("Start of the for loop thread state --"+Thread.currentThread().getState());
				for (String value : seasonList) {
					//Pause for 4 seconds
					try {
						Thread.sleep(4000);
					} catch (InterruptedException exp) {
						System.err.println(exp.getMessage());
					}
					//Print a message
					System.out.println(value);
					System.out.println("Inside for loop thread state --"+Thread.currentThread().getState());
				}
				
				System.out.println("End of the for loop thread state -- "+Thread.currentThread().getState());

		
	}

}
