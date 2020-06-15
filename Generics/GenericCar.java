package com.generics;

public class GenericCar<T extends Car> {

	T ob;

	GenericCar(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}

	public void doRunTest() {
		this.ob.displayClass();
	}
}
