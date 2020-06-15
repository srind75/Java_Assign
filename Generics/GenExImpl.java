package com.generics;

public class GenExImpl {

	public static void main(String args[]) {
		// Create a GenEx reference for Integers.
		GenEx<Integer> iOb;		
		iOb = new GenEx<Integer>(88);		
		iOb.showType();	
		int v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		
		// Create a GenEx object for Strings.
		GenEx<String> strOb = new GenEx<String>("Generics Test");		
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);
		}
		}