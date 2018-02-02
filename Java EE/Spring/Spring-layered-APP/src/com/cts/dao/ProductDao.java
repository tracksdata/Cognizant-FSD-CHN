package com.cts.dao;

import com.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	Product findProduct(int prodId);

}