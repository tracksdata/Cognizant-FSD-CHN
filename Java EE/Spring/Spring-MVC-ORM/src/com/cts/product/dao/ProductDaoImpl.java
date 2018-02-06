package com.cts.product.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.ProductEntity;
import com.cts.product.model.Employee;


@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void saveProduct(ProductEntity prod) {

		Session ses = sf.getCurrentSession();
		ses.save(prod);

	}
	
	
	public List<ProductEntity> listProds(){
	
		Session ses=sf.openSession();
		
		CriteriaBuilder cb = ses.getCriteriaBuilder();
		CriteriaQuery<ProductEntity> cq = cb.createQuery(ProductEntity.class);
		Root<ProductEntity> root = cq.from(ProductEntity.class);

		cq.select(root);

		Query qry = ses.createQuery(cq);
		
		return qry.getResultList();
		
		
	}

}
