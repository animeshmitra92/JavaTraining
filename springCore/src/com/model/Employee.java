package com.model;

public class Employee {
	int empid;
	String name;
	
	public Employee(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
