<<<<<<< HEAD
package classworkdayseven.assignment;

import java.io.File;
import java.util.Scanner;

public class FileSearchAssign {

	
	public static void main(String[] argv) throws Exception
	    {
	       
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the name of the directory");
	       String path = sc.nextLine();
	       System.out.println("File name");
	       String filename = sc.nextLine();
	       File file = new File(path);
	       int k=0;
	       if(file.isDirectory());
	       File []files=file.listFiles();
	       for(File file1:files) {
	    	   if(file1.isFile()&& file1.getName().equals(filename)) {
	    		   System.out.println("File found");
	    		   k=1;
	    		   break;
	    	   }
	    	   sc.close();	       
	       }
	       if(k==0) {
			  System.out.println("File not found");
		   }
	    }
=======
package classworkdayseven.assignment;

import java.io.File;
import java.util.Scanner;

public class FileSearchAssign {

	
	public static void main(String[] argv) throws Exception
	    {
	       
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the name of the directory");
	       String path = sc.nextLine();
	       System.out.println("File name");
	       String filename = sc.nextLine();
	       File file = new File(path);
	       int k=0;
	       if(file.isDirectory());
	       File []files=file.listFiles();
	       for(File file1:files) {
	    	   if(file1.isFile()&& file1.getName().equals(filename)) {
	    		   System.out.println("File found");
	    		   k=1;
	    		   break;
	    	   }
	    	   sc.close();	       
	       }
	       if(k==0) {
			  System.out.println("File not found");
		   }
	    }
>>>>>>> 41c599540af8e6ef9971290eeea8dd7358a54175
}