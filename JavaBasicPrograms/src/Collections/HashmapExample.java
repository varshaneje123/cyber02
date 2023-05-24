package Collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();//

		map1.put(1, "Mango");
		map1.put(1, "Apple");
		map1.put(1, "Banana");
		map1.put(1, "Grapes");
		System.out.println("Map elements :" + map1);
		System.out.println("Iterating HashMap.......");
		for (java.util.Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + ((java.util.Map.Entry<Integer, String>) m).getValue());
		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements:" + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		System.out.println("After invoking put() method");
		for (java.util.Map.Entry m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + "" + ((java.util.Map.Entry) m1).getValue());
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method list of elements: " + hm);
		for (Map.Entry m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + "" + ((java.util.Map.Entry) m1).getValue());

		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(102, "Ravi");
		map.putAll(hm);

		System.out.println("After invoking putAll() mehod " + map);
		for (Map.Entry m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + "" + ((java.util.Map.Entry) m1).getValue());

		}

		System.out.println("Initial list of elements:" + map);
		map.remove(100);
		System.out.println("Updated list of elements:" + map);
		// key value pair based removal
		map.remove(102, "Rahul");
		System.out.println("Updated list of elements:" + map);
		// key based value replace
		map.replace(103, "Amar");
		System.out.println("Updated list of elements:" + map);
		for (Map.Entry m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + "" + ((java.util.Map.Entry) m1).getValue());
		}
		// String map;
		// key-value based value replace
		map.replace(103, "Ravi");
		System.out.println("Updated list of elements:" + map);
		for (Map.Entry m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + "" + ((java.util.Map.Entry) m1).getValue());
		}

	}

}
