package com;

public class Demo3 {
	
	void fun(int x) {
		System.out.println("Int: "+x);
	}
	void fun(long x) {
		System.out.println("Long: "+x);
	}
	
	void fun(float x) {
		System.out.println("Float: "+x);
	}
	
	/*void fun(double x) {
		System.out.println("Double: "+x);
	}*/
	
	public static void main(String[] args) {
		
		Demo3 d=new Demo3();
		//d.fun(23.66); // double
		//d.fun(76.45f);// float
		
		//d.fun(665.76); //?
		
		double dd=87.455;
		float f=(float)dd;
		
		float ff=87.45f;
		double ddd=ff;
		
		
	}

}
