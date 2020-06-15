package com.exceptions.assign;

public class ClassLoad {

	static {
		System.out.println("Class Loading");
	}

	 ClassLoad() {
		System.out.println("Object Creating");
	}
}