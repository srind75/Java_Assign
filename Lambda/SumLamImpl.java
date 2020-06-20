package com.functional.lambda;

import java.util.function.Predicate;

public class SumLamImpl {

	public static void main(String[] args) {

		FiSum s = (x, y) -> System.out.println("Sum is : " + (x + y));
		s.add(4, 5);

	}

}
