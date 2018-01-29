package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	public boolean saveProduct(Product prod);

	public Product findProduct(String prodId);

	public List<Product> listAll();

	public boolean deleteProduct(String prodId);

	public boolean updateProduct(Product prod);

}
