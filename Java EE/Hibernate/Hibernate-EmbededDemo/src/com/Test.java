package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Transaction tx=ses.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(34873);
		
		
		Address addr=new Address();
		addr.setAddrId(1);
		addr.setCity("HYD");
		addr.setStreet("S1");
		
		
		emp.setAddr(addr);
		
		ses.save(emp);
	
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
