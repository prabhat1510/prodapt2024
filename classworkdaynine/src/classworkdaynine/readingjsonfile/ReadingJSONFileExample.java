package classworkdaynine.readingjsonfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadingJSONFileExample {

	public static void main(String[] args) {
		File file = new File("D:\\Downloads\\example_1.json");
		// try with resources
		try (FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr);) {

			//System.out.println(br.readLine());
			//1. Read the entire file content and store it as a String object
			//2. Then perform string operation
			String str ; //We have option of using StringBuffer
			Map<String,String> map = new HashMap<String,String>();
			while((str = br.readLine())!=null) {
				//Add only key and corresponding value
				//Modify this and use if condition to check whether it is { or " or : 
				if(!(str.equals("{") || str.equals("}"))) {
					String[] s = str.split("\": \"");
					//String[] s2 =s.spl
					map.put(s[0], s[1]);
				}
				System.out.println(map);
			}
			System.out.println("***************************");
			System.out.println(str);
			System.out.println(map);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
