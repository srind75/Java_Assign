package com.interfa.assignment;

public class LoanRunner {

	public static void main(String[] args) {
		Loan l=new HomeLoan();
		l.getLoan();
		
		Loan v=new VehicleLoan();
		v.getLoan();

	}

}
