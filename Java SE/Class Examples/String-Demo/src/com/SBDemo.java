package com;

public class SBDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Abc");
		StringBuffer sb2=new StringBuffer("Abc");
		StringBuilder sb3=new StringBuilder("Abc");
		
		System.out.println("Sb1: "+sb1);
		System.out.println("Sb2: "+sb2);
		System.out.println("Hash Code of Sb1 "+System.identityHashCode(sb1));
		System.out.println("Hash Code of Sb2 "+System.identityHashCode(sb2));
		System.out.println("--------------------------");
		sb1.reverse();
		System.out.println("Sb1: "+sb1);
		System.out.println("Hash Code of Sb1 "+System.identityHashCode(sb1));
		
	}

}
