package com;
public class Test {

	public static void main(String[] args) {
		
		Customer cust1=new Customer(1024);
		Customer cust2=new Customer(1025,"Ruth");
		Customer cust3=new Customer(1026,"Ozvitha");
		
		cust1.display();
		cust2.display();
		cust3.display();
		//cust1.MGRNAME="James"; // Invalid
		
		
	

		System.out.println("-- Test class");
	}

}
