package com;

public class Bank {// final/ default/ public / abstract

	private int accNo;
	String custName;

	void openAccount() {
		System.out.println("-- outer class openAccount method");
	}

	public class Locker { // an inner can be static and private
		public void openLocker() {
			System.out.println("-- inner class openlock method");

		}
	}

}
