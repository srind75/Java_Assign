package com.exceptions.assign;

public class Transaction {
	public void withdraw(Account acc, int wd_Amt) {
		try {
			System.out.println("Transaction Details");
			System.out.println("-------------------------");
			System.out.println("Account Number :" + acc.accNo);
			System.out.println("Account Name :" + acc.accName);
			System.out.println("Account Type :" + acc.accType);
			System.out.println("Transaction Type :WITHDRAW");
			System.out.println("Withdraw Amount :" + wd_Amt);
			if (acc.balance > wd_Amt) {
				acc.balance = acc.balance - wd_Amt;
				System.out.println("Total Balance :" + acc.balance);
				System.out.println("Transaction Status:SUCCESS");
			} else {
				System.out.println("Total Balance :" + acc.balance);
				System.out.println("Transaction Status:FAILURE");
				throw new InsufficientFundsException(
						"Funds are not Sufficient in your Account, please enter valid Withdraw Amout");
			}
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("*********Finally Method*********");
		}
	}
}

class InsufficientFundsException extends Exception {
	InsufficientFundsException(String err_Msg) {
		super(err_Msg);
	}
}
