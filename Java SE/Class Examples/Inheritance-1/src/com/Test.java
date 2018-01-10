package com;

 class C1 {
	 final int MAX_VAL=10;
	 int empId=2000;

	 void f1() {
		System.out.println("-- C1 class f1  method");
	}

}

 class C2 extends C1 {
	
	void f1() {
		super.empId=100;
		super.f1();
		System.out.println("-- C2 class f1 "+empId);	
	}

	void fun() {

	}

}


public class Test {

	public static void main(String[] args) {

		
	
		C1 c1 = new C2();
		c1.f1();
	}

}
