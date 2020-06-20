package com.functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilterEx {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}

		System.out.println(l1);

		/*
		 * List<Integer> l2 = new ArrayList<>(); for (Integer i : l1) { if(i%2==0) {
		 * l2.add(i); } } System.out.println("even numbers are : "+l2);
		 */

		List<Integer> list = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("even numbers are : " + list);
		
		//count
		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count: " + count);
		
		//Sorted
		List<Integer> collect = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted  : " + collect);
		
		
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
		List<Integer> l3 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("using comparator  : " + l3);
		
		Integer max = l1.stream().max(comp).get();
		System.out.println(max);
		
		//foreach
		l1.stream().forEach(i->System.out.println(i));
		
		
		List<Integer> l50 = new ArrayList<>();

		for (int i = 0; i <= 50; i++) {
			l50.add(i);
		}
		
		 //parallel stream
		Stream<Integer> parallelStream = l50.parallelStream();  
       List<Integer> list2 = parallelStream.filter(i -> i%2 == 0).collect(Collectors.toList());
     //	  System.out.println(list2);
       list2.forEach(i->System.out.println(i));
       //.toArray(Integer[]::new);
      //  System.out.print(evenNumbersArr);


	}
}