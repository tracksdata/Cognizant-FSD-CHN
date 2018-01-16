package com;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		try {
			
			File file=new File("d:/abc/test.txt");
			
			file.mkdir();
			System.out.println("-- Done ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
