package com;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double salary;

	public Employee(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	
	@Override
	public int compareTo(Employee emp) {
		
		return empId-emp.getEmpId();
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
	
	
	public static void display(List<Employee> emps) {
		System.out.println("Id\tName\tSalary");
		System.out.println("-------------------------");
		for(Employee emp:emps) {
		System.out.print(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getSalary());
		System.out.println();
		}
		
	}
	
	
	
	

}
