package com.functional.lambda;

public class MethodRef {

	public static void myMethod() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {

		Runnable r = MethodRef::myMethod;
		Thread t = new Thread(r);
		t.start();

		for (int j = 0; j <= 10; j++) {
			System.out.println("Main thread");
		}
		

	}

}
