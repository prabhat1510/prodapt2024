package classworkdayseven.ioexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		File file = new File("D:\\prodapt2024\\output\\write.txt");
		FileOutputStream fos = null;
		try {
			String word = "Good Morning";
			byte[] dataToBeWritten = word.getBytes();
			fos = new FileOutputStream(file);
			fos.write(dataToBeWritten);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File doesn't exists");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Write operation failed");
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("Unable to close the file output stream");
			}
		}
	}

}
