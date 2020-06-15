package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionExa {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("first");
		alist.add("second item");
		alist.add("third item");
		alist.add("fourth item");

		System.out.println("Size :  " + alist.size());
		System.out.println("Index :  " + alist.get(1));
		alist.remove(0); // Remove the first item
		System.out.println("Size of alist after deletions: " + alist.size());

		// Traversing list through Iterator
		Iterator<String> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(5);
		System.out.println("set Size :  " + set.size());
		set.remove(2);
		System.out.println("Size of set after deletions: " + set.size());
		System.out.println("set contains 2 : " + set.contains(2));
		System.out.println("set is Empty : " + set.isEmpty());
		;

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Lasko"); // Put elements in Map
		map.put(2, "Borosill");
		map.put(3, "REC");
		map.put(4, "Vedanta");

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
