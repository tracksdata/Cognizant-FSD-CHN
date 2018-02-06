package com.cts.product.service;
import java.util.List;

import com.cts.product.entity.ProductEntity;
import com.cts.product.model.Product;

public interface SaveProductService {

	void saveProduct(ProductEntity prod);
	public List<ProductEntity> listProds();

}