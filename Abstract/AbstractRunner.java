package com.assign.abstrct;

import java.util.Scanner;

public class AbstractRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		  Scanner in = new Scanner(System.in); // Construct Scanner object  
	      System.out.println("Enter status (S or M) =");
	      while (!in.hasNext("[SM]")) {
	          System.out.println("Enter status (S or M) =!");
	          in.next();
	      }
	      
	      char status = in.next().charAt(0);         // Read in next char into status
	      System.out.print("Enter income = ");
	      
	      double income;
		do {
	    	    System.out.println("Please enter a positive number!");
	    	 	    while (!in.hasNextDouble()) {
	    	        System.out.println("That's not a number!");
	    	        in.next(); 
	    	    }
	    	    income = in.nextDouble();
	    	} while (income <= 0);
	      	  
	      in.close();
	      
	      AbstractImpl ai = new AbstractImpl();
	      ai.calculateTax(status,income);
	      
	     
	      

	}

}
