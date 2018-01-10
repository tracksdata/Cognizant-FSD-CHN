package com;

import com.cts.emp.dao.EmployeeDao;
import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.entity.Employee;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
	
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(347348);
		
		EmployeeDao empDao=new EmployeeDaoImpl();
		empDao.findEmployee(1024);
		empDao.saveEmployee(emp);
		empDao.updateEmployee(102);
		empDao.findEmployee(84);
		
		

	}

}
