package com.cts.prod.service;

import com.cts.prod.model.Product;

public interface ProductService {

	void addProduct(Product prod);

	String searchProduct(String prodId);

	void dropProduct(String prodId);

}