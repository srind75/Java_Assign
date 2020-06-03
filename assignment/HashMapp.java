package com.collection.assignment;

import java.util.HashMap;

public class HashMapp {

	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Client1", "BCBS");
		hm.put("Client2", "NCR");
		hm.put("Client3", "GEICO");
		System.out.println("HashMap: " + hm);
		System.out.println(hm.put("Client3", "TCS"));
		System.out.println("HashMap: " + hm);
		System.out.println("Key in Map");
		for (String s : hm.keySet())
			System.out.println(s);
		System.out.println("Values in Map");
		for (String s : hm.values())
			System.out.println(s);
		System.out.println("value associated with Client2:" + hm.get("Client2"));
		System.out.println("Size of HashMap:" + hm.size());
		System.out.println("remove mapping associated with Client2:" + hm.remove("Client2"));
		System.out.println("HashMap after removal:" + hm);
	}
}

