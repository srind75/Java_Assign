package com.functional.lambda;

public class Employee2 {

	private int id;
	private String name;
	private String role;
	private String salary;
	private int deptId;

	

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", deptId=" + deptId
				+ "]";
	}

	

	}
