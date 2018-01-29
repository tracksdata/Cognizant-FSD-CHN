package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;

public class ProductServiceImpl implements ProductService{

	private ProductDao prodDao=new ProductDaoImpl();
	
	@Override
	public boolean saveProduct(Product prod) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(prod);
	}

	@Override
	public Product findProduct(String prodId) {
		// TODO Auto-generated method stub
		return prodDao.findProduct(prodId);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return prodDao.listAll();
	}

	@Override
	public boolean deleteProduct(String prodId) {
		// TODO Auto-generated method stub
		return prodDao.deleteProduct(prodId);
	}

	@Override
	public boolean updateProduct(Product newProd) {
		
		return prodDao.updateProduct(newProd);
	}

	
	
}
