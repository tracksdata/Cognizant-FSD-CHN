package com;

public class Bank_V2 {// final/ default/ public / abstract

	private int accNo;
	String custName="Praveen";

	public void openAccount() {
		System.out.println("-- outer class openAccount method");
	}
	
	/*void test() {
		grantLockerAcess();
	}*/

	public void grantLockerAcess() {
		// Only this method can create Locker class object
		 class Locker { // an inner can be static and private
			
			 public void openLocker() {
				System.out.println("-- inner class openlock method "+custName);
				openAccount();
			}
			
		}
		
		 Locker l=new Locker();
		 l.openLocker();
	} // end of metho
	
	

}
