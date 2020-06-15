package com.assign.hsqldb;

public class Address {
	private int addrIDd;
	private int hno;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	
	
	
	public Address(int addrIDd, int hno, String street, String city, String state, int zipcode) {
		//super();
		this.addrIDd = addrIDd;
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public int getAddrIDd() {
		return addrIDd;
	}
	public void setAddrIDd(int addrIDd) {
		this.addrIDd = addrIDd;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
