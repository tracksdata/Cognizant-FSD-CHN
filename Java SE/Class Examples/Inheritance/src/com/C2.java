package com;

class C1{
	int empNo;
	
	void fun() {
		System.out.println("C1 class fun method");
	}
	
}
public class C2 extends C1 {
	int age;
	/*void fun() {
		System.out.println("C2 class fun method");
	}
*/
	
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		
		C2 c2=new C2();
		c2.fun();
		
		System.out.println(c2.hashCode());
		
	}
}
