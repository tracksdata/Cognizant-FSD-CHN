package com;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Test.class);
		
		PropertyConfigurator.configure("src/log4j.properties");
		
		
		try {
			
			FileInputStream fis=new FileInputStream("d:/2myfile.txt");
			
			
			
		} catch (Exception e) {
			
			log.debug("Sample debug message");
			log.info("Sample info message "+e);
			log.error("Sample error message");
			log.fatal("Sample fatal message");
			
			
			System.out.println("-- Done");
		}
		
		
		

	}

}
