package com;

public class Employee {

	/*
	 * -> Setters will not have return type but will have parameters -> getters will
	 * not have parameters but will have return type
	 */
	private int empId;
	private String empName;
	private double salary;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		// Security checks
		// Calculation
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {

		if (empId == 1024)
			return salary;
		else
			return 0;
	}

	public void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------------------");
	}

}
