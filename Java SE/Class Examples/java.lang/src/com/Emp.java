package com;

public class Emp {
	
	private int empId=10;
	private String empName="Praveen";
	
	@Override
	public String toString() {	
		return "Employyee Id "+empId+" and Name is "+empName;
	}
	
	public static void main(String[] args) {
		
		Emp e=new Emp();
		System.out.println(e);
		
	}

}
