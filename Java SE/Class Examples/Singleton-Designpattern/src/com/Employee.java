package com;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	private static Employee emp=null;
	
	private Employee() {
	System.out.println("-- Employee obj created with "+this.hashCode());
	}
	
	public static Employee getEmpObj() {	
		if(emp==null)
		emp=new Employee();
			
		return emp;
	}
	
	public void display() {
		System.out.println("Employee Id: "+empId);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
