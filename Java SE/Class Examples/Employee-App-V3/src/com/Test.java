package com;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.dao.JProgramer;
import com.cts.emp.dao.ProjectManager;
import com.cts.emp.dao.SProgramer;
import com.cts.emp.entity.Employee;
import com.cts.emp.service.EmployeeService;
import com.cts.emp.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
	
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(347348);
		
		EmployeeService empService=new EmployeeServiceImpl();
		empService.findEmployee(1024);
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
