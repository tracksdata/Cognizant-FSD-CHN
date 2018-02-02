package com.cts.service;

import com.Product;

public interface ProductService {

	void saveProduct(Product prod);

	Product findProduct(int prodId);

}