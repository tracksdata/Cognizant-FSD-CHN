package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Criteria_Test2 {

	public static void main(String[] args) {

		// 1. Load config file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Create Session Factory object

		SessionFactory sf = cfg.buildSessionFactory();

		// 3. Create a session from session factory

		Session ses = sf.openSession();

		CriteriaBuilder cb = ses.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);

		cq.select(root);

		Query<Employee> qry = ses.createQuery(cq);
		
		List<Employee> emps= qry.list();
		for (Employee emp : emps) {
			System.out.println("Empid: " + emp.getEmpId());
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("----------------------------");

		}
		

		ses.close();
		sf.close();

	}

}
