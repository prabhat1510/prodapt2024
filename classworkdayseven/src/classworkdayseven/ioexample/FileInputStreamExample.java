package classworkdayseven.ioexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// InputStream and OutputStream api or classes to perform IO in your program
		// InputStream to read data from source and OutputStream to write data to
		// destination
		// Read a byte from a files
		//Physical location of a file whose data to we are going to fetch or read
		File file = new File("D:\\prodapt2024\\output\\abc.txt");
		FileInputStream fis ;
		try {
			fis = new FileInputStream(file);
			int pos =0;
			while((pos=fis.read()) != -1) {
				//int n = fis.read();
				System.out.println((char)pos);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File doesn't exists");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("IO exception while reading the content");
		}
	}

}
