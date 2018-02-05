package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.emp.dao.EmployeeDaoImpl;


public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDaoImpl empDao= ac.getBean("empDao",EmployeeDaoImpl.class);
		
		//Map<String, Object> emps= empDao.findEmployee(12);
		
		//System.out.println(emps);

		List<Map<String,Object>> emps=empDao.getEmpsAsMap();
		
		System.out.println(emps);
		
		for(Map m:emps) {
			
			System.out.println(m.get("empId"));
			System.out.println(m.get("empName"));
			System.out.println(m.get("salary"));
			System.out.println("-----------------------");
		}
		
		
		ac.registerShutdownHook();
		
		
		
		
		
	}

}
