package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String clsName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a class name");
		clsName=sc.nextLine();
		
		// Factory method technique
		
		try {
			Class cl= Class.forName(clsName);// just loads a class into memory
			//Employee emp=(Employee) cl.newInstance();
			Object obj=cl.newInstance();
			
			if(obj instanceof Employee) {
				Employee emp=(Employee) obj;
				emp.f1();
			}
			if(obj instanceof Person) {
				Person p=(Person) obj;
				p.f3();
			}
			if(obj instanceof Bank) {
				Bank b=(Bank) obj;
				b.f2();
			}
				
			
			
			
		} catch (Exception e) {
			System.out.println("--- Faile due to "+e);
			
		}
		
		
		
		

	}

}
