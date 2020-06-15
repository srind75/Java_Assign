package com.ass.inner;

public class Account {
	String BranchNam;

	// inner class
	private  class SavingsAccount {
		 public void print() {
	         System.out.println("This is an inner class");
	      }
	}

	 // Accessing he inner class from the method within
	   void display_Inner() {
		   SavingsAccount sa = new SavingsAccount();
	      sa.print();
	   }

}

