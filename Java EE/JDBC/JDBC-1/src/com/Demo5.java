package com;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo5 {
	/*
	 * create table my_student( rno int(10) primary key, name varchar(20), marks
	 * int(10) );
	 */

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt=con.createStatement();
			String qry="select * from my_student";
			ResultSet rs=stmt.executeQuery(qry);
			
			while(rs.next()==true) {
				System.out.println("Rno: "+rs.getString(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Total Marks:"+rs.getString(3));	
				System.out.println("------------------");
			}
			
			
			
			
			

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
