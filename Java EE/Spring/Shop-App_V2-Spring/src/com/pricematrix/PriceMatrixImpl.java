package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository("price")
public class PriceMatrixImpl implements PriceMatrix {
	
	
	public PriceMatrixImpl() {
		System.out.println("-- Pricematrix Impl object created");
	}

	
	@Override
	public double getItemPrice(String itemCode) {

		// code to connect to DB and fetch price of an item

		return 100.00;
	}
	
	

}
