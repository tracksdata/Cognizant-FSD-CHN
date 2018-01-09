package com;

public class Demo4 {
	
	void fun(int x) {
		System.out.println("Int: "+x);
	}
	void fun(char x) {
		System.out.println("Char: "+x);
	}
	
	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
		d.fun((char)65); // char
		d.fun('a'); // char
		d.fun((int)'a'); // int
		
		String s1="100";
		String s2="200";
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		System.out.println(i1+i2);
		
		int no=1000;
		int no1=2000;
		String s3=no+"";
		String s4=no1+"";
		System.out.println(s3+s4);
		
		
		
	
		
	}

}
