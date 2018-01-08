package com;

import java.util.Scanner;

public class Use_V1 {

	public static void main(String[] args) {
		
		int eid;
		String ename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input EID: ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Input ENAME: ");
		ename=sc.nextLine();
		
		Employee emp=new Employee();
		emp.setData(eid, ename);
		//emp.setData(1029, "Prashi");
		System.out.println("Input EID for emp1: ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Input ENAME for emp1: ");
		ename=sc.nextLine();
		
		Employee emp1=new Employee();
		emp1.setData(eid, ename);
		
		System.out.println("Input EID for emp2: ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Input ENAME for emp2: ");
		ename=sc.nextLine();
		
		Employee emp2=new Employee();
		emp2.setData(eid, ename);
		
		emp.display();
		emp1.display();
		emp2.display();

	}

}
