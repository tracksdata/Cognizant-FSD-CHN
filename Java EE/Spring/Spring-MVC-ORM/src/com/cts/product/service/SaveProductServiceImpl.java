package com.cts.product.service;


import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.ProductEntity;
import com.cts.product.model.Product;

@Service("saveService")
public class SaveProductServiceImpl implements SaveProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	@Override
	@Transactional
	public void saveProduct(ProductEntity prod) {
		prodDao.saveProduct(prod);

	}
	
	@Transactional
	public List<ProductEntity> listProds(){
				
		return prodDao.listProds();
		
	}

}
