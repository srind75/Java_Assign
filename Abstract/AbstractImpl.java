package com.assign.abstrct;

public class AbstractImpl extends AbstarctEx{

	final double RATE1 = 0.10; // Tax rates
	final double RATE2 = 0.12;
	final double RATE3 = 0.22;
	final double RATE4 = 0.24;

	final double State_RATE = 0.0307;

	final double S1 = 9700.0; // Tax brackets for single
	final double S2 = 39475.0;
	final double S3 = 84200.0;
	// final double S4 = 160725.0;

	final double M1 = 19400.0; // Tax brackets for married
	final double M2 = 78950.0;
	final double M3 = 168400.0;

	char status;
	double income;
	double tax;
	double fed_tax;
	double state_tax;

	//@Override
	/*
	 * public double calculateTax() { // TODO Auto-generated method stub return 0; }
	 */
	
	@Override
	public double calculateTax(char status,double income) {		
		double fed_tax;
		if (status == 'S') { // ***** single
			if (income <= S1)
				fed_tax = RATE1 * income;
			else if (income <= S2)
				fed_tax = RATE1 * S1 + RATE2 * (income - S1);
			else if (income <= S3)
				fed_tax = RATE1 * S1 + RATE2 * (S2 - S1) + RATE3 * (income - S2);
			else
				fed_tax = RATE1 * S1 + RATE2 * (S2 - S1) + RATE3 * (income - S2) + RATE4 * (income - S3);
		} else // Married
		{
			if (income <= M1)
				fed_tax = RATE1 * income;
			else if (income <= M2)
				fed_tax = RATE1 * M1 + RATE2 * (income - M1);
			else if (income <= M3)
				fed_tax = RATE1 * M1 + RATE2 * (M2 - M1) + RATE3 * (income - M2);
			else
				fed_tax = RATE1 * M1 + RATE2 * (M2 - M1) + RATE3 * (income - M2) + RATE4 * (income - M3);
		}
		System.out.println("Federal Tax = " + fed_tax);
		double state_tax = State_RATE * income;
		System.out.println("State Tax = " + state_tax);
		tax = fed_tax + state_tax;
		System.out.println("Total Tax = " + tax);
		return tax;

	}

}
