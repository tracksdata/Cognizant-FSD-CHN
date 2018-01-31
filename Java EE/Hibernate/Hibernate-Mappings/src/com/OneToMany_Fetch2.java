package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.College;
import com.onetomany.University;

public class OneToMany_Fetch2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		University u = ses.get(University.class, 101);

		System.out.println("University Id: " + u.getUniversityId());
		System.out.println("University name: " + u.getUniversityName());

		for (College c : u.getColleges()) {

			System.out.println("College Id: " + c.getCollegeId());
			System.out.println("College Name: " + c.getCollegeName());
			System.out.println("-------------------------");
		}

		ses.close();
		sf.close();

	}

}
