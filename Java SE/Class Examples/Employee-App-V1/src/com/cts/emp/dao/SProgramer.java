package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public interface SProgramer {
	
	Employee findEmployee(int empId);
	void saveEmployee(Employee emp);
	

}
