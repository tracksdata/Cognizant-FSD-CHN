package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.pojo.Employee;

public class ResultSetExtractorTest {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDaoImpl empDao = ac.getBean("empDao", EmployeeDaoImpl.class);

		// List<Employee> emps=empDao.resultSetExtractor();

		Employee emp = empDao.resultSetExtractor();

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		/*
		 * for(Employee emp:emps) { System.out.println(emp.getEmpId());
		 * System.out.println(emp.getEmpName()); System.out.println(emp.getSalary());
		 * System.out.println("----------------------------"); }
		 */

		ac.registerShutdownHook();

	}

}
