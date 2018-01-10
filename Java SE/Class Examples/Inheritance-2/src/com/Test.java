package com;
class C1{
	public C1() {
		System.out.println("-- C1 Default Constuctor "+this.hashCode());
	}
	
	public C1(int x) {
		System.out.println("-- C1 Constuctor "+x);
	}
	
}

class C2 extends C1{
	
	public C2() {
		//super(100);
		System.out.println("-- C2 Default Constructor "+this.hashCode());
	}
	
	public C2(int x) {
		super(200);
		System.out.println("C2 Constructor "+x);
	}
	
}
public class Test {
	public static void main(String[] args) {
		
		C2 c2=new C2(100);
		//C2 c3=new C2();
		
		

	}

}
