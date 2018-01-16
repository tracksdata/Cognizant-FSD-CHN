package com.cts.emp.service;

import com.cts.emp.entity.Employee;

public interface EmployeeService{
	public void saveEmployee(Employee emp);
	public Employee findEmployee(int empId);
	public void updateEmployee(int empId);
	public void deleteEmployee(int empId);
	

}
