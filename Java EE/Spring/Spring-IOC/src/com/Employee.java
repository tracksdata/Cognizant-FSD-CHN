package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public void display() {
		System.out.println("EMp Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public Employee() {

		System.out.println("-- Employee Object Created");
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
