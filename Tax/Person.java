package com.assign.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Person implements TaxCalculator, Serializable {

	String name;
	String address;
	double income;
	double tax;
	char status;

	Person(String name, String address, double income, double tax, char status) {
		this.name = name;
		this.address = address;
		this.income = income;
		this.tax = tax;
		this.status = status;
	}

	@Override
	public void calculateTax() {
		// public void calculateTax(double income, char status) {
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

	}

}
