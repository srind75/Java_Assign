package com.collection.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MailingAddress {

	public static void main(String args[]) {
		ArrayList<Address> ml = new ArrayList<Address>();
		ml.add(new Address("SD", "WallSt", "Hanover", "MD"));
		ml.add(new Address("Ram", "WSide", "Bethesda", "MD"));
		ml.add(new Address("Kri", "MillST", "Elkridge", "MD"));
		
		Iterator<Address> itr = ml.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element.toString() + "\n");
		}
		System.out.println("----------");
		
		//traverse backwards.
        ListIterator<Address> mlListIterator = ml.listIterator(ml.size());
        while (mlListIterator.hasPrevious()) {
            Address ml1 = mlListIterator.previous();
            System.out.println(ml1  + "\n");
        }
		
	}
}