package classworkdaysix.exceptionstrhowsexample;

import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			throwOne();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void throwOne() throws FileNotFoundException {
		boolean isFileExists = false;
		if(isFileExists) {
			System.out.println("File is present");
		}else {
			throw new FileNotFoundException();
		}
	}

}
