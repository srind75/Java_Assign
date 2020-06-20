package com.functional.lambda;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {

		//Predicate returns boolean
		// Using Integer Predicate
		Predicate<Integer> p = i -> (i > 20);
		System.out.println(p.test(15));
		System.out.println(p.test(25));

		// Using String Predicate
		Predicate<String> p1 = ss -> (ss.length() > 5);
		System.out.println(p1.test("Srinivas"));
		System.out.println(p1.test("Hello"));

		// Passing predicate to a method
		int[] x = { 0, 7, 10, 12, 14, 15, 18, 20, 25, 28, 31, 26 };
		Predicate<Integer> p3 = i -> (i > 20);
		System.out.println("Greater than 20: ");
		method(p3, x);

		Predicate<Integer> p4 = i -> i % 2 == 0;
		System.out.println("Even numbers are : ");
		method(p4, x);

		System.out.println("Not greater than 20 : ");
		method(p3.negate(), x);

		System.out.println("greater than 20  and even : ");
		method(p3.and(p4), x);

		System.out.println("greater than 20  or even : ");
		method(p3.or(p4), x);

	}

	static void method(Predicate<Integer> p, int[] x) {

		for (int eachValue : x) {
			if (p.test(eachValue)) {
				System.out.println(eachValue);
			}

		}
	}

}
