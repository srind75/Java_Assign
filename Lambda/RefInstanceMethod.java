package com.functional.lambda;

public class RefInstanceMethod {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		FiSum f = (x, y) -> System.out.println(x + y);
		f.add(5, 6);

		//Referencing instance method
		RefInstanceMethod ref = new RefInstanceMethod();
		FiSum f2 = ref::sum;
		f2.add(20, 30);

	}

}
