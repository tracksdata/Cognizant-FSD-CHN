package com.cts.prod.service;

import com.cts.prod.dao.ProductDao;
import com.cts.prod.dao.ProductDaoImpl;
import com.cts.prod.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao = new ProductDaoImpl();

	@Override
	public void addProduct(Product prod) {

		prodDao.saveProduct(prod);

	}

	@Override
	public String searchProduct(String prodId) {

		return prodDao.findProduct(prodId);
	}

	@Override
	public void dropProduct(String prodId) {
		prodDao.deleteProduct(prodId);

	}

}
