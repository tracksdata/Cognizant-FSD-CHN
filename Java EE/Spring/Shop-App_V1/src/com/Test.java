package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "I001", "I002", "I003" };
		String[] cart2 = { "I001", "I002" };

		
		
		PriceMatrix price=new PriceMatrixImpl();
		
		
		
		//------------------------------------
		BillingImpl bill = new BillingImpl();
		bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);
		//-------------------------------------

		System.out.println("Total for Cart1 is " + total);
		
		total = bill.getCartTotal(cart2);

		System.out.println("Total for Cart2 is " + total);

	}

}
