package com.cts.emp.service;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.dao.JProgramer;
import com.cts.emp.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	JProgramer jp=new EmployeeDaoImpl();
	
	
	@Override
	public void saveEmployee(Employee emp) {
		
		
		
	}

	@Override
	public Employee findEmployee(int empId) {
		jp.findEmployee(empId);
		return null;
	}

	@Override
	public void updateEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	
}
