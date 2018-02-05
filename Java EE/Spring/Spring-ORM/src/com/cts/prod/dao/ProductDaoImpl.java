package com.cts.prod.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.prod.entities.Employee;
import com.cts.prod.entities.Product;

@Repository("prodDao")
public class ProductDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveProduct(Product prod) {
		Session ses = sessionFactory.getCurrentSession();
		ses.save(prod);

		System.out.println("Dao: " + prod.getProdName() + " Saved to DB");

	}

	@Transactional
	public List<Employee> listEmployees() {

		Session ses = sessionFactory.getCurrentSession();
		String qry = "from Employee";
		Query q1 = ses.createQuery(qry);

		return q1.getResultList();

		// return
		// sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

}
