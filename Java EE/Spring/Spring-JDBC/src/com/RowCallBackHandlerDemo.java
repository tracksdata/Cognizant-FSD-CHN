package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.pojo.Employee;


public class RowCallBackHandlerDemo {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDaoImpl empDao= ac.getBean("empDao",EmployeeDaoImpl.class);
		
		empDao.rowCallBackHandler();
		
		
		ac.registerShutdownHook();
		
		
		
		
		
		
		
	}

}
