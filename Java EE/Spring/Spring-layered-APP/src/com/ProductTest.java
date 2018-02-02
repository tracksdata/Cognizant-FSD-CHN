package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

	
		Product prod=new Product();
		
		prod.setProdId(10);
		prod.setProdName("Book");
		prod.setPrice(347384);
		
		ProductService prodService= ac.getBean("prodService",ProductService.class);
		
		prodService.saveProduct(prod);
		
		
		ac.registerShutdownHook();

	}

}
