package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_Types {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
			String qry = "select * from employee";

			ResultSet rs = stmt.executeQuery(qry);
			
			rs.absolute(3);
			rs.next();
			rs.updateString(2, "New Data");
			//rs.deleteRow();
			//rs.updateInt(1, 1033);
			rs.updateString(2, "James");
			//rs.insertRow();
			//rs.updateRow();
			if (rs.next()) {
				System.out.println("EMp Id: " + rs.getString(1));
				System.out.println("Emp Name: " + rs.getString(2));
				System.out.println("Salary: " + rs.getString(3));
				System.out.println("------------------");
			}
			System.out.println("Record Updated");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
