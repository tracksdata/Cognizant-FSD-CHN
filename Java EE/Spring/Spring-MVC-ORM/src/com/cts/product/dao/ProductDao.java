package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.ProductEntity;
import com.cts.product.model.Product;

public interface ProductDao {

	void saveProduct(ProductEntity prod);
	public List<ProductEntity> listProds();

}