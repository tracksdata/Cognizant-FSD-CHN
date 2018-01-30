package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.CapitalCity;
import com.onetoone.Country;

public class OneToOne_Save {
	
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		
		Country c=new Country();
		c.setCountryId("US");
		c.setCountryName("USA");
		
		CapitalCity cc=new CapitalCity();
		cc.setCityId("US");
		cc.setCityName("Wasinton DC");
		
		c.setCity(cc);
		
		
		ses.save(c);
		
		ses.beginTransaction().commit();
		
		System.out.println("--- Done ---");
		
		
		
		
		
		
	}
	
	
	
	

}
