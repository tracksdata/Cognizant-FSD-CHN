package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Shape s = ac.getBean("circle", Shape.class);

		s.draw();

		s = ac.getBean("square", Shape.class);

		s.draw();

		ac.registerShutdownHook();

	}

}
