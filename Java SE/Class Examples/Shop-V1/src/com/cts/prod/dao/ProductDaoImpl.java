package com.cts.prod.dao;

import com.cts.prod.model.Product;

public class ProductDaoImpl implements ProductDao {
	
	String[] prods= {"P001","P002","P003"};

	@Override
	public void saveProduct(Product prod) {

	}

	@Override
	public String findProduct(String prodId) {

		for(String pid:prods) {
			if(prodId.equals(pid)) {
				return pid;
			}
		}
		return "Not Found";
	}

	@Override
	public void deleteProduct(String prodId) {

	}

}
