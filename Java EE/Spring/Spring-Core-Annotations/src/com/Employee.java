package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		System.out.println("Employee Obj Created");
	}
	
	

	@Autowired
	private Department dept; // has 'A'

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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
