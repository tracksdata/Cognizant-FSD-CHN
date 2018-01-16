package com;

import java.io.File;
import java.io.FileInputStream;

public class ByteReadDemo {

	public static void main(String[] args) {

		try {

			File file = new File("d:/abc/abc.txt");
			FileInputStream fis = new FileInputStream(file);

			for (int i = 0; i < file.length(); i++) {
				System.out.print((char) fis.read());
			}

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
