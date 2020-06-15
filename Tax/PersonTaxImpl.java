package com.assign.io;

import java.util.ArrayList;

public class PersonTaxImpl {

	public static void main(String[] args) {

		Person p1 = new Person("chan", "Danville", 90000.00, 0.0, 'S');
		Person p2 = new Person("Krish", "Danville", 120000.00, 0.0, 'M');
		Person p3 = new Person("Arun", "Danville", 90000.00, 0.0, 'S');
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		PersonTaxCal ptc = new PersonTaxCal();
		ptc.personListData(pList);
		ptc.personTaxCalreadFile();

	}
}
