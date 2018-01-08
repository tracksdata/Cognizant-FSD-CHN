package com;

public class Employee_V1 {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee_V1() {
		// TODO Auto-generated constructor stub
	}

	public Employee_V1(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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

	public void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------------------");
	}

}
