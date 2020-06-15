package com.assign.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SecondThread implements Runnable {
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
	
	SecondThread(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		//personListData(ArrayList<Person> pList);
	}

	
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	
	
	public void personTaxCalreadFile() {
		System.out.println("personTaxCalreadFile  .start .."+threadName);
		String file_Nameip = null;
		String file_Nameop = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos2 = null;
		ObjectOutputStream oos2 = null;
		try {

		//	file_Nameip = "C:/data/PersonListdata.txt";
		//	file_Nameop = "C:/data/PersonTaxCal.txt";
			file_Nameip = "C:\\JavaT\\Test_Data\\Person_Write_Thread.txt";
			file_Nameop = "C:\\JavaT\\Test_Data\\Person_RW_Thread.txt";
			
			
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
			System.out.println("Thread Name is  : "+Thread.currentThread().getName());
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
		System.out.println("personTaxCalreadFile ------- .end .."+threadName);
	}
	
	
}
