package com;

public class Bank_V1 {// final/ default/ public / abstract

	private int accNo;
	String custName="Praveen";

	public void openAccount() {
		System.out.println("-- outer class openAccount method");
	}

	public void grantLockerAcess() {
		// login verifecation
		Locker l=new Locker();
		l.openLocker();
		
	}
	
	private class Locker { // an inner can be static and private
		public void openLocker() {
			System.out.println("-- inner class openlock method "+custName);
			openAccount();
		}
		
	}

}
