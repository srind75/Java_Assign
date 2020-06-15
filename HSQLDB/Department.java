package com.assign.hsqldb;

import java.util.List;

public class Department {
	
	private int deptId;
	private String deptName;
	//private List<Integer> employee;
	
	public Department(int deptId, String deptName) {
		//super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
