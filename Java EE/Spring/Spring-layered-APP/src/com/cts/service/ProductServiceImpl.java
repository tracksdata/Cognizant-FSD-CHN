package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product;
import com.cts.dao.ProductDao;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public void saveProduct(Product prod) {

		prodDao.saveProduct(prod);

	}

	@Override
	public Product findProduct(int prodId) {

		return prodDao.findProduct(prodId);
	}

}
