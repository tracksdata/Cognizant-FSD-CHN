package com;

public class Test {

	void calc(int x) {
		System.out.println("Square: " + (x * x));
	}

	void calc(char ch) {
		System.out.println("Character: " + ch);
	}

	void calc(float x) {
		System.out.println("FLoat " + (x * x));
	}

	void calc(String msg) {
		System.out.println("Hello " + msg);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.calc('A');
		t.calc(100);
		t.calc(65.45f);
		t.calc("Praveen");
		

	}
	
	
}
