package classworkdayeleven.mapexample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	//TreeMap will give you a sorted output
	public static void main(String[] args) {
		TreeMap<String,Double> hm = new TreeMap<String,Double>();
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Tod Hall", 1378.00);
		hm.put("Ralph Smith", 99.22);
		//hm.put(null, 18.24);
		hm.put("Rajesh", null);
		//hm.put(null, 16.5);
		hm.put("Prabhat", 99.22);
		hm.put("Ralph Smith", 98.22);

		System.out.println(hm);
		System.out.println(hm.size());
		
		Set set = hm.entrySet();// Get a set of the entries in map
		System.out.println(set);
		System.out.println(hm.keySet());
		System.out.println(hm.get("Prabhat"));
		System.out.println(hm.values());
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		System.out.println("*************************************");
		for(Map.Entry<String,Double> m : hm.entrySet()) {
			System.out.println(m.getKey() + " == "+m.getValue());
		}
		
		System.out.println("*************************************");
		
	}

}
