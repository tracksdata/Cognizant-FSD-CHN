package com;
// static inner class
public class Bank_V3 {// final/ default/ public / abstract

	private int accNo;
	static String custName="Ozvitha";

	void openAccount() {
		System.out.println("-- outer class openAccount method");
	}

	public static  class Locker { // an inner can be static and private
		public void openLocker() {
			System.out.println("-- inner class openlock method "+custName);
			//openAccount();
		}
		
	}

}
