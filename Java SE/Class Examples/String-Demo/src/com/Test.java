package com;

public class Test {
	
	public static void main(String[] args) {
		
		String s1="Abc";
		System.out.println("S1: "+s1);
		//System.out.println("Hash Code S1: "+s1.hashCode());
		System.out.println("hash Code of s1: "+System.identityHashCode(s1));
		String s2=new String("Abc1");
		
		System.out.println("S2: "+s2);
		//System.out.println("Hash Code S2: "+s2.hashCode());
		System.out.println("hash Code of s2: "+System.identityHashCode(s2));
		
		if(s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equals");
	}

}
