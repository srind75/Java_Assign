package com.exceptions.assign;

public class RuntimeExcep {
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
				
		try { 	
			
			
			/*
			 * //ArithmeticException int a=10; int b=0; float c=a/b;
			 */
			
			
			/*//NullPointerException
			 * java.util.Date d=null; System.out.println(d.toString());
			 */
			 
			
			/*//ArrayIndexOutOfBoundsException
			 * int[] a = { 1, 2, 3, 4, 5 }; System.out.println(a[10]);
			 */
			  
			  String str = "Hello";
			  System.out.println(str.charAt(10));
			
		} catch ( ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("This block will execute");
		}
	}

}