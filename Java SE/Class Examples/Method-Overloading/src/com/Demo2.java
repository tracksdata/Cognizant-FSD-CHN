package com;

public class Demo2 {
	
	void fun() {
		System.out.println("fun with no arguments");
	}
	/*void fun(int x) {
		System.out.println("integer: "+x);
	}*/
	void fun(long x) {
		System.out.println("Long: "+x);
	}
	/*void fun(short x) {
		System.out.println("Short: "+x);
	}*/
	
	/*void fun(byte x) {
		System.out.println("Byte: "+x);
	}*/
	

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		
		d.fun((short)100); 
		// Narrow -> Big to Small
		// wide ---> Small to Big
		/*long l=100;
		int x;
		x=(int)l;*/
		//System.out.println(l);
		
		
	}
}
