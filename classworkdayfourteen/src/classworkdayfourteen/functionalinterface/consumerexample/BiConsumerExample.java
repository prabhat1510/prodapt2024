package classworkdayfourteen.functionalinterface.consumerexample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		System.out.println("**********************************");
		//Object of HashMap class which will store String type key and String type value
		//Object is referred by map variable
		Map<String, String> map = new HashMap<String, String>();
		
		//Insert data in map
		map.put("1", "Infosys");
		map.put("2", "AGL");
		map.put("3", "Prodapt");
		map.put("4", "Wipro");
		
		//Iterate values from map and display key and value in below format	
		map.forEach(
				(k, v) -> System.out.println("Key : " + k + ", Value : " + v)
				);
		
		System.out.println("************************************************");
		BiConsumer<String, String> biConsumer = (k, v) -> System.out.println("Key : " + k + ", Value : " + v);
		map.forEach(biConsumer);

	}
}
