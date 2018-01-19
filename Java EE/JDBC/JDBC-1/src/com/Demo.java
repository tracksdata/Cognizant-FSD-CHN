package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	/*
	create table my_student(
	rno int(10) primary key,
	name varchar(20),
	marks int(10)
	);
	 */

	public static void main(String[] args) {
		
		try {
			
			// 1. Load Driver class
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver class Loaded");
			//2. Establish Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("--- Connection Established..");
			
			// Db Operations
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rno: ");
			int rno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Marks");
			int m=sc.nextInt();
			
			String qry="insert into my_student values("+rno+",'"+name+"',"+m+")";
			System.out.println("Query: "+qry);
			
			Statement stmt=con.createStatement();
			
			int x=stmt.executeUpdate(qry);
			
			System.out.println(x+" records inserted");
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		

	}

}
