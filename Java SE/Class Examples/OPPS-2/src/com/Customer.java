package com;

import java.util.Scanner;

public class Customer {

	int custId;
	String custName;
	final String MGRNAME;
	
	

	/*
	 * Customer() { // default constructor
	 * System.out.println("-- Customer obj created "); }
	 */

	Customer(int custId) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Set Manager Name: ");
		MGRNAME=sc.nextLine();
		//Integer.SIZE;
		this.custId = custId;
	}
	

	Customer(int custId, String custName) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Set Manager Name: ");
		MGRNAME=sc.nextLine();
		this.custId = custId;
		this.custName = custName;
	}

	void display() {
		System.out.println("Customer Id: " + custId);
		System.out.println("Cust Name: "+custName);
		System.out.println("Manager Name: "+MGRNAME);
	}

}
