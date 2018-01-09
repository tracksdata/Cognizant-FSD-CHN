package com;

public class Demo1 {
	
	void fun() {
		System.out.println("fun with no arguments");
	}
	void fun(int x) {
		System.out.println("integer: "+x);
	}
	void fun(long x) {
		System.out.println("Long: "+x);
	}
	void fun(short x) {
		System.out.println("Short: "+x);
	}
	
	void fun(byte x) {
		System.out.println("Byte: "+x);
	}
	

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		long l=10;
		byte b=10;
		short s=10;
		d.fun(10); // Integer
		d.fun(100L); // Long
		d.fun((short)100); // short
		d.fun((byte) 100); // byte
		d.fun(b); // byte
		d.fun(s); // short
		d.fun(l); // long
		
	}
}
