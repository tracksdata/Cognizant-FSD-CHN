package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(90, "Kgh", 19000);
		Employee e2=new Employee(70, "Dfg", 13000);
		Employee e3=new Employee(11, "Rhl", 25000);
		Employee e4=new Employee(10, "Eui", 15000);
		Employee e5=new Employee(24, "Abc", 11000);
		
		
		List<Employee> emps=new ArrayList<>();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		System.out.println("-- Before Sort");
		Employee.display(emps);
		
		
		
		System.out.println("-- Sorting on empid");
		System.out.println("----------------------");
		
		Collections.sort(emps);
		
		Employee.display(emps);
		
		
		System.out.println("-- Sorting on empname");
		System.out.println("----------------------");
		
		Collections.sort(emps,new SortByName());
		
		Employee.display(emps);
		
		
		System.out.println("-- Sorting on salary");
		System.out.println("----------------------");
		
		Collections.sort(emps,new SortBySalary());
		
		Employee.display(emps);
		
	}

}

class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
	
	
}

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return (int) (emp1.getSalary()-emp2.getSalary());
	}
}


