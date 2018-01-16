package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		File file = null;
		FileReader fr = null;

		try {

			file = new File("D:/abc/test.txt");

			fr = new FileReader(file);

			for (int i = 0; i < file.length(); i++) {
				System.out.print((char) fr.read());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
