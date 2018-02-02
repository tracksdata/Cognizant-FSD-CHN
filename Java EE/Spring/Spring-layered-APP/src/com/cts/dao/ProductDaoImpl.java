package com.cts.dao;

import org.springframework.stereotype.Repository;

import com.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Override
	public void saveProduct(Product prod) {

		System.out.println("-- Product Dao: " + prod.getProdName() + " saved to DB");
	}

	@Override
	public Product findProduct(int prodId) {

		return null;
	}

}
