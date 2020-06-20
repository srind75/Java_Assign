package com.functional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Danville");
		l1.add("Bloomsburg");
		l1.add("Lewisburg");

		List<String> list = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(list);
		
		System.out.println("----------------------");
	 l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

		
		

	}

}
