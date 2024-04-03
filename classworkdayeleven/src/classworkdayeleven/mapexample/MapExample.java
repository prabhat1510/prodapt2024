package classworkdayeleven.mapexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//Stores data in a key value pair
		Map map = new HashMap();//Object of HashMap class is created
		map.put(1, "Mahi");
		map.put(2, "Shiv");
		map.put(3, "Natraj");
		map.put(null, "Roshika");//Key null
		map.put(null, null);//Key and Value both null
		map.put(4, null);//Value is null 
		map.put(3, "Natraj");
		map.put(5, "");//Empty Value
		map.put("Rajesh", "Kumar");
		System.out.println(map);
		Map<String,String> cocapMap= new HashMap<String,String>();
		cocapMap.put("India", "New Delhi");
		cocapMap.put("Srilanka", "Colombo");
		//cocapMap.put(1, "London");
		System.out.println(cocapMap);
		String capital = cocapMap.get("Srilanka");
		System.out.println(capital);
		System.out.println(map.get(null));
		System.out.println(map.get(5));
		System.out.println(map.get("Rajesh"));
		
		Set keys =map.keySet();//Gives all keys of map in the form set
		Collection c = map.values();//Gives all values of map as a collection
		System.out.println(keys);
		System.out.println(c);
		System.out.println(Arrays.asList(c));//Converting collection of values into list
	}

}
