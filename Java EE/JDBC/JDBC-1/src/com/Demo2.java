package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
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
			
			String qry="insert into my_student values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qry);
			
			ps.setInt(3, m);
			ps.setInt(1, rno);
			ps.setString(2,name);
			
			
			
			int x=ps.executeUpdate();
			
			System.out.println(x+" records inserted");
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		

	}

}
