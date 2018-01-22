package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo9 {
	/*
	 * create table my_student( rno int(10) primary key, name varchar(20), marks
	 * int(10) );
	 */

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			String qry = " select\r\n" + 
					"        d.dept_id,\r\n" + 
					"        d.dept_name,\r\n" + 
					"        e.emp_id,\r\n" + 
					"        e.emp_name,\r\n" + 
					"        e.salary \r\n" + 
					"    from\r\n" + 
					"        dept d \r\n" + 
					"    left outer join\r\n" + 
					"        dept_details dd \r\n" + 
					"            on d.dept_id=dd.dept_id \r\n" + 
					"    left outer join\r\n" + 
					"        Employee e \r\n" + 
					"            on dd.emp_id= e.emp_id \r\n" + 
					"    where\r\n" + 
					"        d.dept_id=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Dept to find: ");
			int deptId=sc.nextInt();
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			boolean flag=false;
			while (rs.next()) {
				flag=true;
				System.out.println("Dept Id: "+rs.getString(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Emp Id: "+rs.getString(3));
				System.out.println("EmpName: "+rs.getString(4));
				System.out.println("Salary: "+rs.getString(5));
				System.out.println("-----------------------------");
				
			}
			
			if(!flag) {
				System.out.println("Roll No "+deptId+" not exist in DB");
			}

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
