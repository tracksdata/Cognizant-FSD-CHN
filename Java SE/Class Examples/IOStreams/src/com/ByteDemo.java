package com;

import java.io.FileOutputStream;

public class ByteDemo {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("D:/abc/cts.txt",true);
			String s1 = "Chenai is Cool city!";
			
			char[] arr1= s1.toCharArray();

			//byte[] data = s1.getBytes();

			//fos.write(data);
			
			 for(int i=0;i<arr1.length;i++) {
				 fos.write((int)arr1[i]);
				 //System.out.print((int)arr1[i]);
			 }

			System.out.println("-- Done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
