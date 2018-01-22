package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_Types_Oracle {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("-- COnnected with Oracle");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String qry = "select * from employee";

			ResultSet rs = stmt.executeQuery(qry);
			
			rs.absolute(2);
			rs.deleteRow();
			
			/*if (rs.next()) {
				rs.previous();
				System.out.println("EMp Id: " + rs.getString(1));
				System.out.println("Emp Name: " + rs.getString(2));
				System.out.println("Salary: " + rs.getString(3));
				System.out.println("------------------");
			}*/
			System.out.println("-- record Deleted");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
