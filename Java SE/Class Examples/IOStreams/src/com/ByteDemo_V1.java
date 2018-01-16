package com;

import java.io.File;
import java.io.FileOutputStream;

public class ByteDemo_V1 {

	public static void main(String[] args) {

		try {

			File file = new File("D:/abc/abc.txt");
			FileOutputStream fos = null;

			if (file.exists()) {
				fos = new FileOutputStream(file);
			} else {
				System.out.println("File "+file.getName()+" not found in "+file.getParent()+" location. So Creating New File");
				file.createNewFile();
				fos = new FileOutputStream(file);
			}
			String s1 = "Chenai is Cool city!";

			char[] arr1 = s1.toCharArray();

			// byte[] data = s1.getBytes();

			// fos.write(data);

			for (int i = 0; i < arr1.length; i++) {
				fos.write((int) arr1[i]);
				// System.out.print((int)arr1[i]);
			}

			System.out.println("-- Done");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
