package com.assign.thread;

import java.util.ArrayList;

public class THreadImpl extends Thread {
	ArrayList<Person> pList = new ArrayList<Person>();

	public void run() {

		printMsg();
		FirstThread firstThread = new FirstThread("Thread1");
		firstThread.start();
		// ArrayList<Person> pList = null;
		firstThread.personListData(pList);

		System.out.println("Thread Name iin run THreadImpl is : " + Thread.currentThread().getName());
	}

	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("chan", "Danville", 90000.00, 0.0, 'S');
		// ArrayList<Person> pList = new ArrayList<Person>();
		// pList.add(p1);

		THreadImpl t = new THreadImpl();
		t.pList.add(p1);
		t.start();

		// Person p1 = new Person("chan", "Danville", 90000.00, 0.0, 'S');
		// ArrayList<Person> pList = new ArrayList<Person>();
		// pList.add(p1);
		// FirstThread firstThread = new FirstThread("Thread1");
		// firstThread.start();
		// firstThread.personListData(pList);
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println("THreadImpl  error ");
			e.printStackTrace();
		}

		System.out.println(" SecondThread start ------------ ");
		SecondThread secondThread = new SecondThread("Thread2");
		secondThread.start();
		secondThread.personTaxCalreadFile();
		System.out.println(" SecondThread end ------------ ");

	}

}
