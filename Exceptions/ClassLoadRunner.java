package com.exceptions.assign;

public class ClassLoadRunner {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		//to load class bytecode to the memory
	Class c = Class.forName("Testtt"); // ClassNotFoundException
	Object obj=c.newInstance();
	}

}
