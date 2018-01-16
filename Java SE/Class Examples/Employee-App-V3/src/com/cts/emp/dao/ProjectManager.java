package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public interface ProjectManager {

	Employee findEmployee(int empId);
	void saveEmployee(Employee emp);
	void deleteEmployee(int empId);
	void updateEmployee(int empId);
	
	
}
