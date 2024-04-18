package java17features.recordclasses.serializeexample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String... args) throws Exception {
		try (var fis = new FileInputStream("D:\\prodapt2024\\output\\serial.data"); 
			var ois = new ObjectInputStream(fis)) {
			System.out.println(ois.readObject());
			//System.out.println(ois.readObject()); 
		}
	}
}
