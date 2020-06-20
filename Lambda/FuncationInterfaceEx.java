package com.functional.lambda;

import java.util.function.Function;

public class FuncationInterfaceEx {

	public static void main(String[] args) {

//Function interface return any type and it has only one method called apply() and it can takes any types of parameters and return any type is used to express Lambda

		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("Srinivas"));
		
	}

}
