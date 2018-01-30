package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.CapitalCity;
import com.onetoone.Country;

public class OneToOne_Fetch {
	
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Country c= ses.get(Country.class, "US");
		
		System.out.println("Country id: "+c.getCountryId());
		System.out.println("Country Name: "+c.getCountryName());
		System.out.println("Capital City: "+c.getCity().getCityName());
		
		System.out.println("---------------------------");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
