package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {
	public boolean saveProduct(Product prod);

	public Product findProduct(String prodId);

	public List<Product> listAll();

	public boolean deleteProduct(String prodId); 
	
	public boolean updateProduct(Product newProd);

}
