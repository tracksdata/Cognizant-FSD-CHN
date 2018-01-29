package com.cts.product.dao.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DBUtils {
	
	private static Connection con=null;
	
	private DBUtils() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getConnection() {
		FileInputStream fis=null;
		Properties props=null;
		try {
			if(con==null) {
				fis=new FileInputStream("d:/db.properties");
				props=new Properties();
				props.load(fis);
				Class.forName(props.getProperty("driver"));
				con=DriverManager.getConnection(props.getProperty("url"),props.getProperty("userName"),props.getProperty("password"));
			}
			
			
		} catch (Exception e) {
			System.out.println("-- Dao Failed due to "+e);
		}finally {
			
		}
		
		return con;
	}
	
	public static void closeConnection() {
		
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
