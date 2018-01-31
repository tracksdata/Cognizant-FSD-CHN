package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Multi_Column_Test {

	public static void main(String[] args) {

		// 1. Load config file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Create Session Factory object

		SessionFactory sf = cfg.buildSessionFactory();

		// 3. Create a session from session factory

		Session ses = sf.openSession();

		Query<Object[]> qry = ses.createQuery("select e.empId,e.empName,e.salary from Employee as e");

		List<Object[]> records= qry.list();
		
		
		for(int i=0;i<records.size();i++) {
			
			Object[] cols=records.get(i);
			
			for(Object col:cols) {
				System.out.println(col);
			}
			
			System.out.println("-------------------");
			
			
		}
		
		
		

		ses.close();
		sf.close();

	}

}
