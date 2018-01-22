package com;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo6 {
	/*
	 * create table my_student( rno int(10) primary key, name varchar(20), marks
	 * int(10) );
	 */

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			String qry = "select * from my_student where rno=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rno to find: ");
			int rno=sc.nextInt();
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, rno);
			ResultSet rs = ps.executeQuery();
			boolean flag=false;
			if (rs.next()) {
				flag=true;
				System.out.println("Rno: " + rs.getString(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Total Marks:" + rs.getString(3));
				System.out.println("------------------");
			}
			
			if(!flag) {
				System.out.println("Roll No "+rno+" not exist in DB");
			}

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
