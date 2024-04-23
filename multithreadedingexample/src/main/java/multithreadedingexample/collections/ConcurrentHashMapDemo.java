package multithreadedingexample.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<String, String>();
		hashMap.put("A", "Chennai");
		hashMap.put("B", "Mumbai");
		hashMap.put("C", "Patiala");
		hashMap.put("D", "Panjim");
		
		String result = hashMap.search(10000, (key,value)->value.startsWith("P")?value:null);
		System.out.println(result);
		
		ConcurrentHashMap<String,Integer> hMap = new ConcurrentHashMap<String, Integer>();
		hMap.put("A", 1);
		hMap.put("B", 2);
		hMap.put("C", 3);
		hMap.put("D", 4);
		
		Object results = hMap.reduce(10000, (key,value)->value.intValue(),(value1,value2)->Integer.max(value1, value2));
		System.out.println(results);
	}

}
