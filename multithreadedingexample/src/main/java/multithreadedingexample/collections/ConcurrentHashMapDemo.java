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
		
		
	}

}
