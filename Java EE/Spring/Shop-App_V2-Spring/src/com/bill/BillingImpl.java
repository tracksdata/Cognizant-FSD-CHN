package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;
@Service("bill")
public class BillingImpl {

	/*
	 * Problems ------------
	 * 
	 * 1. Too many dependency object creations -> Performance goes down
	 * 
	 * Why this issue happened? ---------------------------- -> Creation of
	 * dependency class obj in the dependent class
	 * 
	 * Solution --------- -> Do not create dependency objects in the dependent class
	 * -> Find the object from diffent source -> JNDI (Java Namining Directory
	 * interface) -> JNDI location is tightly coupled with java classes
	 * 
	 * Best solution -------------- -> Do not search or find, instead ask one one
	 * else to create dependency objects (IoC -> Inversion of control)
	 * 
	 * DI --- Injecting Dependency object to the dependent class is DI
	 *
	 * 
	 */

	@Autowired
	private PriceMatrix price; // dependency

	
	public double getCartTotal(String[] cart) {

		double total = 0.0;

		// PriceMatrix price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
