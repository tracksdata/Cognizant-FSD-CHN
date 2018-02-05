package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean("emp", Employee.class);
		Person p = ac.getBean("person", Person.class);

		emp.setEmpId(10);
		p.setAge(87);

		emp.getEmpId();
		p.getAge();
		emp.getEmpName();
		
		//System.out.println("EmpId: " + emp.getEmpId());

	}

}
