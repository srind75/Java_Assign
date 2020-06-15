package com.assign.hsqldb;

import java.util.List;

public class Employee {
	private int emplid;
	private String emplName;
	private int deptid;
	private List<Integer> address;
	

	
	public Employee(int emplid, String emplName, int deptid, List<Integer> address) {
	//	super();
		this.emplid = emplid;
		this.emplName = emplName;
		this.deptid = deptid;
		this.address = address;
	}
	
	public List<Integer> getAddress() {
		return address;
	}
	public void setAddress(List<Integer> address) {
		this.address = address;
	}
	public int getEmplid() {
		return emplid;
	}
	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

}
