package com.exceptions.assign;

public class AcountTransaRunner {

	public static void main(String[] args) {
		Account acc1 = new Account("abc123", "Srini", "Savings", 10000);
		Transaction tx1 = new Transaction();
		tx1.withdraw(acc1, 5000);
		System.out.println();
		Account acc2 = new Account("xyz123", "Anil", "Savings", 10000);
		Transaction tx2 = new Transaction();
		tx2.withdraw(acc2, 15000);
	}
}
