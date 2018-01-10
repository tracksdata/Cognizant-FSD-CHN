package com.cts.emp.dao;

import com.cts.emp.entity.Employee;

public interface SProgramer {

	void saveEmployee(Employee emp);

	Employee findEmployee(int empId);

}