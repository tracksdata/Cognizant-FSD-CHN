package com;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			
			File file=new File("D:/abc/test.txt");
			
			FileWriter fw=new FileWriter(file);
			
			String msg="Data to be in the file";
			
			fw.write(msg);
			System.out.println("Done");
			
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
