package com.generics;

public class GenEx<T> {
	private T ob; 

	GenEx(T o) {
		ob = o;
	}

	// Return ob.
	public T getob() {
		return ob;
	}

	// Show type of T.
	public void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
