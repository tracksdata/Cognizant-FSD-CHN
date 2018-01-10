package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public class EmployeeDaoImpl implements JProgramer, SProgramer, ProjectManager {

	@Override
	public void saveEmployee(Employee emp) {
		System.out.println(emp.getEmpId() + " is saved to DB");

	}

	@Override
	public Employee findEmployee(int empId) {
		System.out.println("--- find Employee Method");

		return null;
	}

	@Override
	public void updateEmployee(int empId) {
		System.out.println("--- Update method of employee");

	}

	@Override
	public void deleteEmployee(int empId) {
		System.out.println("-- Delete method of Employee");

	}
	
	public void fewF1() {
		
	}

	@Override
	public Employee findEmployee(String empName) {
		System.out.println("--- By EmpName find Method");
		return null;
	}

}
