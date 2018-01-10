package com;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.dao.JProgramer;
import com.cts.emp.dao.ProjectManager;
import com.cts.emp.dao.SProgramer;
import com.cts.emp.entity.Employee;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(347348);

		ProjectManager pm = new EmployeeDaoImpl();
		pm.fewF1();
		SProgramer sp = new EmployeeDaoImpl();
		JProgramer jp = new EmployeeDaoImpl();
	
		sp.findEmployee(1000);
		jp.findEmployee("Praveen");

	}

}
