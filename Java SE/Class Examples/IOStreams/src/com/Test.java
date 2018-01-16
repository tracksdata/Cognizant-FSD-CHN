package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("Ozvitha");
		emp.setSalary(49794);
		emp.setInfo("Info about Employee");
		

		try {
			
			FileOutputStream fos=new FileOutputStream("d:/abc/emp.txt");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			
			System.out.println("--  Writing is  done ");
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
	}

}
