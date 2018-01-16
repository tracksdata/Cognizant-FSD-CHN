package com;

import com.cts.prod.service.ProductService;
import com.cts.prod.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		ProductService prod=new ProductServiceImpl();
		String prodId=prod.searchProduct("P008");
		System.out.println("Product Id: "+prodId);
		

	}

}
