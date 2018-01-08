package com;

public class Employee {
	int empId;
	String empName;
	
	void setData(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;	
	}
	
	void display() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Name: "+empName);	
	}
	

}
