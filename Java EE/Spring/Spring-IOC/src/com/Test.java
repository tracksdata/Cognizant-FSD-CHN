package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e1=(Employee)ac.getBean("emp1");
		Employee e2=(Employee)ac.getBean("emp2");
		

		//System.out.println(e1.getEmpId());
		
		e1.display();
		e2.display();
		
		
	}

}
