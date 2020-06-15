package com.assign.io;

public interface TaxCalculator {

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

	void calculateTax();

}
