package com.assign.abstrct;

public abstract class AbstarctEx  {

	String name;
	String address;
	double income;
	double tax;
	char status;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getIncome() {
		return income;
	}


	public void setIncome(double income) {
		this.income = income;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}


	
	public void Person(String name, String address, double income, double tax, char status) {
		this.name = name;
		this.address = address;
		this.income = income;
		this.tax = tax;
		this.status = status;
	}
	

	public abstract double calculateTax(char status,double income); 
}