package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		// 1. Load config file
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		// 2. Create Session Factory object
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		// 3. Create a session from session factory
		
		Session ses=sf.openSession();
		
		Employee emp=new Employee();
		
		emp.setEmpId(12);
		emp.setEmpName("Ozvitha fernz");
		emp.setSalary(1111);
		
		// 4. persist emp object to session
		
		ses.update(emp); 
		
		// 5. commit all objects which are avaialble in session
		
		ses.beginTransaction().commit();
		
		System.out.println("--- Record saved to Db");
		
		
		
		
		
		
		
		
	}

}
