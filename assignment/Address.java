package com.collection.assignment;

public class Address {

	private String name;
	private String street;
	private String city;
	private String state;

	Address(String n, String s, String c, String st) {
		name = n;
		street = s;
		city = c;
		state = st;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state;
	}
}