package com;

import java.io.PrintStream;
public class Employee {

	int empId;
	String empName;
	double salary;
	
	/*
	 * Instantiation and object creation
	 */
	
	public static void main(String[] args) {
		
	Employee emp=new Employee();// Object
	Employee emp1=new Employee();
	System.out.println("Emp Hash Code: "+emp.hashCode());
	System.out.println("Emp1 Hash Code: "+emp1.hashCode());
		
	Department dept1=Department.getDepartment();//Instantiation
	Department dept2=Department.getDepartment();
	
	System.out.println("Hash Code of dept1: "+dept1.hashCode());
	System.out.println("Hash Code of dept2: "+dept2.hashCode());
		
	PrintStream pw1=System.out;
	PrintStream pw2=System.out;
	System.out.println("Hash Code of Pw1: "+pw1.hashCode());
	System.out.println("Hash Code of Pw2: "+pw2.hashCode());

	
	String s1="abc";
	System.out.println("Hash code of s1: "+s1.hashCode());
	}

}
