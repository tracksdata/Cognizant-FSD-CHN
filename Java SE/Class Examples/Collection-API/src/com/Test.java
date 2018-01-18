package com;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis=new FileInputStream("data.properties");
			Properties props=new Properties();
			props.load(fis);
			
			
			
			System.out.println("Name: "+props.getProperty("name"));
			System.out.println("Age: "+props.getProperty("my.name"));
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		

	}

}
