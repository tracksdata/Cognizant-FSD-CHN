package com.pricematrix;

// dependency class
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
