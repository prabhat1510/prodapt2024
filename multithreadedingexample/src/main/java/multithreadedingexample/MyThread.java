package multithreadedingexample;


//Creating a custom thread class named as MyThread by extending java.lang.Thread class
public class MyThread extends Thread{
	
	//MyThread class method
	public void myThreadDisplay() {
		System.out.println("I am my thread display");
	}
	
	//Overriding the run method of java.lang.Thread class
	 public void run() {
		 //User logic we will write it 
		 System.out.println("Inside run method of my thread class");
	 }
}
