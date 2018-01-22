package com;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class BatchUpdate_Demo {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// set connection auto commit to false
			con.setAutoCommit(false);

			Statement stmt = con.createStatement();

			String q1 = "insert into employee values(1069,'BBB',763,87)";
			String q2 = "update employee set emp_name='DDDD' where emp_id=1024";
			String q3 = "delete from employee where emp_id=1025";

			// Assign all queries to the statement interface batch array
			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);

			int x[] = stmt.executeBatch();
			int count = 0;
			// x[0] = 0
			// x[1] = 1
			// x[2] = 0

			for (int i = 0; i < x.length; i++) {
				count++;
				System.out.println("X[" + i + "] = " + x[i]);
			}
			
			boolean flag=true;
			for(int i=0;i<x.length;i++) {
				if(x[i]==0) {
					flag=false;
				}
			}
			if(flag==true) {
				con.commit();
			}else
				con.rollback();
			System.out.println("Total " + count + " Statemnets Executed");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
