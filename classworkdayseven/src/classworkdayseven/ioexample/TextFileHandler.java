package classworkdayseven.ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileHandler {

	/**
	 * country.csv
	 * key= country
	 * value=capital
	 */
	public static void main(String[] args) {
		Map<String,String> countryMap = new HashMap<String,String>();
		String country = null;
		String capital = null;
		File file =new File("D:\\prodapt2024\\country.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null) {
				String[] countryCapValue = line.split(",");
				countryMap.put(countryCapValue[0], countryCapValue[1]);
			}
			System.out.println(countryMap);
			fr.close();
			br.close();
			
			File file1 = new File("D:\\prodapt2024\\newcountry.csv");
			if (!file1.exists()) {
				boolean flag = file1.createNewFile();
				if(flag) {
					System.out.println("New file created");
				}

			}
			FileWriter fw = new FileWriter(file1,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("country,capital\n");
			bw.write("Nepal,Kathmandu\n");
			bw.write("Bhutan,Thimpu\n");
			bw.write("Pakistan,Islamabad\n");
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}
