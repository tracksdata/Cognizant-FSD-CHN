package com;

class Employee {
	static int count=0;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- Object is Garbage Collected "+count++);
	}
}

public class Test {

	public static void main(String[] args) {

	
		Runtime rt=Runtime.getRuntime();
		System.out.println("--Total Memory "+rt.totalMemory());
		
		for(int i=1;i<=1000000;i++) {
			Employee emp=new Employee();
		}
		
		System.out.println("Free Memory: "+rt.freeMemory());
		
		//emp = null; // GC
		
		//System.gc(); // Invoked GC for Sure
		
		System.out.println("---- Done ----");

	}

}
