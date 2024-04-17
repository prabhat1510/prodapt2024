package java11and17features.newfilemethos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		try {
			//Path path = Files.createTempFile("tempFile",".txt");
			Path path = Paths.get("C:\\Users\\UD SYSTEMS\\Desktop\\orders.csv");
			//Write to a file
			
			Path path1 = Paths.get("D:\\prodapt2024\\output\\temptext.txt");
			Files.writeString(path1,"hello everyone");
			
			//Read
			String str = Files.readString(path);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
