package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);
	Employee findEmployee(int empId);
	void updateEmployee(int empId);
	void deleteEmployee(int empId);

}
