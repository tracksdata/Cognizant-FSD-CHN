package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.College;
import com.onetomany.University;

public class OneToOne_Fetch2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		
		College c= ses.get(College.class, 2);
		
		System.out.println("Collge Id: "+c.getCollegeId());
		System.out.println("College name: "+c.getCollegeName());
		System.out.println("University id: "+c.getUni().getUniversityId());
		System.out.println("University Name: "+c.getUni().getUniversityName());
		
		ses.close();
		
		sf.close();

	}

}
