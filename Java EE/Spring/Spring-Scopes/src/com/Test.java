package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
	/*	Employee e1= ac.getBean("emp",Employee.class);
		e1.setEmpId(10);
		Employee e2= ac.getBean("emp",Employee.class);
		
		System.out.println("Emp Hash Code for e1: "+e1.hashCode());
		System.out.println("Emp Hash Code for e2: "+e2.hashCode());
		
		System.out.println("E2 EMp; Id: "+e2.getEmpId());
		*/
		
		System.out.println("--- Done ");
		
	}

}
