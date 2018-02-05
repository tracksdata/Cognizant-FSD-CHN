package com;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.prod.dao.ProductDaoImpl;
import com.cts.prod.entities.Employee;
import com.cts.prod.entities.Product;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		ProductDaoImpl prodDao= ac.getBean("prodDao",ProductDaoImpl.class);
		
		Product prod=new Product();
		prod.setProdId(10);
		prod.setProdName("Pen");
		prod.setPrice(84);
		
		
		//prodDao.saveProduct(prod);
		
		
		List<Employee> emps=prodDao.listEmployees();
		
		for(Employee emp:emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("---------------------------");
		}
		
		
		
		ac.registerShutdownHook();
		

	}

}
