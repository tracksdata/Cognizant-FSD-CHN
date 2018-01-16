package com.cts.prod.dao;

import com.cts.prod.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	String findProduct(String prodId);

	void deleteProduct(String prodId);

}