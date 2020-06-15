package com.exceptions.assign;

import java.util.ArrayList;

public class ClassCastExcep {

	public static void main(String args[]) throws ClassCastException {
		CastA a = new CastA();
		CastB b = (CastB) a; // passing super class object reference variable to sub class reference variable // ClassCastException
		
		try {
			String s = "Hello";
			int i = Integer.parseInt(s);
			System.out.println(s+ "    "+i);
		 } catch ( NumberFormatException e) {
			 
			e.printStackTrace();
		}
		finally{
			System.out.println("  NumberFormatException captured");
		}
		
		
	}
}
