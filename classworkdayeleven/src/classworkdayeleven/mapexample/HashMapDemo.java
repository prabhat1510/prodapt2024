package classworkdayeleven.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Jane Baker", 1378.00);
		hm.put("TodHall", 99.22);
		hm.put("Ralph Smith", -19.08);
		
		Set set = hm.entrySet(); // Get a set of the entries
		System.out.println(set);
		
		Iterator i = set.iterator(); // Get an iterator
		while (i.hasNext()) { // Display elements
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		// Deposit 1000 into John Doe's account
		double balance = ((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", (balance + 1000));
		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
	}
}