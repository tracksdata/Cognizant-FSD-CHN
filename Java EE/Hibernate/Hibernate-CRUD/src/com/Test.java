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
		
		
		Person p=new Person();
		p.setPersonId(16);
		p.setPersonName("Sarah-3");
		p.setAge(241);
		
		/*Person p1=new Person();
		p1.setPersonId(17);
		p1.setPersonName("james-2");
		p1.setAge(213);*/
		
		Person up=(Person) ses.merge(p);
		
		
		ses.beginTransaction().commit();
		
		System.out.println(up.getPersonName()+" Updated");
		System.out.println("--- record saved");
		
		
		
		
		
		
		
	}

}
