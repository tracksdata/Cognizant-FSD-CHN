package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.College;
import com.onetomany.University;

public class OneToMany_Save2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		University u1 = new University();
		University u2 = new University();

		u1.setUniversityId(100);
		u1.setUniversityName("Anna University");

		u2.setUniversityId(101);
		u2.setUniversityName("KITS University");

		College c1 = new College(1, "Boom");
		College c2 = new College(2, "MITS");
		College c3 = new College(3, "LITS");
		College c4 = new College(4, "DFRS");
		College c5 = new College(5, "ASDF");
		College c6 = new College(6, "KJUY");
		College c7 = new College(7, "ASDC");
		College c8 = new College(8, "LMNB");
		College c9 = new College(9, "ESDF");
		College c10 = new College(10, "LMNH");

		u1.getColleges().add(c1);
		u1.getColleges().add(c3);
		u1.getColleges().add(c5);
		u1.getColleges().add(c7);
		u1.getColleges().add(c9);

		u2.getColleges().add(c2);
		u2.getColleges().add(c4);
		u2.getColleges().add(c6);
		u2.getColleges().add(c8);
		u2.getColleges().add(c10);

		ses.save(u1);
		ses.save(u2);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
