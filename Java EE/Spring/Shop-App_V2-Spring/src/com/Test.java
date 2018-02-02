package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "I001", "I002", "I003" };
		String[] cart2 = { "I001", "I002" };

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		
		//------------------------------------
		
		BillingImpl bill= ac.getBean("bill",BillingImpl.class);
		
		
		//------------------------------------
				
		
		double total = bill.getCartTotal(cart1);
		//-------------------------------------

		System.out.println("Total for Cart1 is " + total);
		
		total = bill.getCartTotal(cart2);

		System.out.println("Total for Cart2 is " + total);

	}

}
