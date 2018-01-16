package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public class EmployeeDaoImpl implements JProgramer,SProgramer,ProjectManager{

	public void saveEmployee(Employee emp) {
		System.out.println(emp.getEmpId() + " is saved to DB");

	}

	@Override
	public Employee findEmployee(int empId) {
		System.out.println("--- find Employee Method");

		return null;
	}

	public void updateEmployee(int empId) {
		System.out.println("--- Update method of employee");

	}

	public void deleteEmployee(int empId) {
		System.out.println("-- Delete method of Employee");

	}

}
