package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis=new FileInputStream("D:/Abc/emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee e= (Employee) ois.readObject();
			
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getSalary());
			System.out.println("Info: "+e.getInfo());
			
			
		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
