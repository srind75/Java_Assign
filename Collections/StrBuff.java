package com.collections;

public class StrBuff {

	public static void main(String[] args) {

		String str1=new String("Lasko ");
		 System.out.println(str1.hashCode());  
		String str2=str1.concat("ASL ");
		System.out.println(str2.hashCode());  
		String str3=str2.concat("Innov");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		String name="Hello World";
		System.out.println(name.contains("Hello"));  
		System.out.println(name.endsWith("d"));
		System.out.println();
		StringBuffer sb1=new StringBuffer("Lasko ");
		StringBuffer sb2=sb1.append("ASL ");
		StringBuffer sb3=sb2.append("Innov");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		

	}

}
