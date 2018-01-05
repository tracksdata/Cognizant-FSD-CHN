package com;

import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		
		
		int x[]=new int[5];
		//int[] x=new int[5];
		
		int s=0;
		System.out.println("Enter 5 Nos");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<x.length;i++) {
			x[i]=sc.nextInt();
			s=s+x[i];
		}
		
		System.out.println("Sum is "+s);
		
		
		
		
		
		
		
		
	}

}
