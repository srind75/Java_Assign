package com.assign.thread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FirstThread implements Runnable {
	private Thread t;
	private String threadName;

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

	FirstThread(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
	//	 ArrayList<Person> pList = null;
	//	personListData(pList);
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public void personListData(ArrayList<Person> pList) {
		System.out.println("personListData   ----stasrt " + threadName);
	/*	
	 * Scanner in = new Scanner(System.in); // Construct Scanner object
		System.out.println("Enter status (S or M) =");
		while (!in.hasNext("[SM]")) {
			System.out.println("Enter status (S or M) =!");
			in.next();
		}

		status = in.next().charAt(0); // Read in next char into status
		System.out.print("Enter income = ");

		do {
			System.out.println("Please enter a positive number!");
			while (!in.hasNextDouble()) {
				System.out.println("That's not a number!");
				in.next();
			}
			income = in.nextDouble();
		} while (income <= 0);

		in.close();
		*/

		String file_Name = "C:\\JavaT\\Test_Data\\Person_Write_Thread.txt";
		try (FileOutputStream fos = new FileOutputStream(file_Name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			System.out.println("Serialization of List Object...");

			System.out.println(pList);
			Iterator<Person> it = pList.iterator();
			while (it.hasNext()) {
				Person per = (Person) it.next();
				// per.calculateTax();
				System.out.println("Before Tax calculation    :  " + "=> NAME  :  " + per.name + "   ADDRESS   :  "
						+ per.address + "  INCOME   :  " + per.income + "   TAX   :  " + per.tax + "   STATUS   :  "
						+ per.status);
				System.out.println(".....................");
			}

			oos.writeObject(pList);
			System.out.println("Thread Name is  : "+Thread.currentThread().getName());
			System.out.println("Thread Class Name is  : "+Thread.currentThread().getClass());
			//Thread.currentThread().getContextClassLoader()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Serialization of List Object.  ends..");
		System.out.println("personListData   ----end " + threadName);
	}

}
