package com;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.dao.JProgramer;
import com.cts.emp.dao.ProjectManager;
import com.cts.emp.dao.SProgramer;
import com.cts.emp.entity.Employee;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
	
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(347348);
		
		
		JProgramer jp=new EmployeeDaoImpl();
		jp.findEmployee(9474);
		
		
		SProgramer sp=new EmployeeDaoImpl();
		sp.findEmployee(46);
		sp.saveEmployee(emp);
		
		ProjectManager pm=new EmployeeDaoImpl();
		
		
		
		
		

	}

}
