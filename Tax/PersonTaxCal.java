package com.assign.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonTaxCal {

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

	// @Override
	public void calculateTax() {		
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

	public void personTaxCalreadFile() {

		String file_Nameip = null;
		String file_Nameop = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos2 = null;
		ObjectOutputStream oos2 = null;
		try {

			file_Nameip = "C:/data/PersonListdata.txt";
			file_Nameop = "C:/data/PersonTaxCal.txt";
			System.out.println("Serialization of List Object...");
			fos2 = new FileOutputStream(file_Nameop);
			oos2 = new ObjectOutputStream(fos2);

			System.out.println("Deserialization of List Object...");
			fis = new FileInputStream(file_Nameip);
			ois = new ObjectInputStream(fis);

			ArrayList<Person> pList = (ArrayList<Person>) ois.readObject();

			System.out.println(pList);
			System.out.println("##############################3");
			Iterator<Person> it = pList.iterator();
			while (it.hasNext()) {
				Person per = (Person) it.next();
				per.calculateTax();
				System.out.println("After tax calculation ==>   :  " + "=> NAME  :  " + per.name + "   ADDRESS   :  "
						+ per.address + "  INCOME   :  " + per.income + "   TAX   :  " + per.tax + "   STATUS   :  "
						+ per.status);

				System.out.println(".....................");
			}
			oos2.writeObject(pList);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
				fos2.close();
				oos2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void personListData(ArrayList<Person> pList) {
		String file_Name = "C:/data/PersonListdata.txt";
		try (FileOutputStream fos = new FileOutputStream(file_Name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			System.out.println("Serialization of List Object...");

			System.out.println(pList);
			Iterator<Person> it = pList.iterator();
			while (it.hasNext()) {
				Person per = (Person) it.next();
				// per.calculateTax();
				System.out.println("Before Tax calculation    :  " + "=> NAME  :  " + per.name + "   ADDRESS   :  " + per.address
						+ "  INCOME   :  " + per.income + "   TAX   :  " + per.tax + "   STATUS   :  " + per.status);
				System.out.println(".....................");
			}

			oos.writeObject(pList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Serialization of List Object.  ends..");

	}
}
