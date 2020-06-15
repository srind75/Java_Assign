package com.generics;

public class GenCollExImpl {

	public static void main(String[] args) {

		Integer inums[] = { 1, 2, 3, 4, 5 };
		GenCollEx<Integer> iob = new GenCollEx<Integer>(inums);
		double v = iob.sum();
		System.out.println("iob average is " + v);
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		GenCollEx<Double> dob = new GenCollEx<Double>(dnums);
		double w = dob.sum();
		System.out.println("dob average is " + w);
		
	}
}