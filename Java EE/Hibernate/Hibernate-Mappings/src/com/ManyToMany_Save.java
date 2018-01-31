package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Course;
import com.manytomany.Student;

public class ManyToMany_Save {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Course c1 = new Course(10, "Java");
		Course c2 = new Course(11, "PHP");
		Course c3 = new Course(12, "CPP");

		Student s1 = new Student(100, "Praveen");
		Student s2 = new Student(101, "Ozvitha");
		Student s3 = new Student(102, "Ruth");
		Student s4 = new Student(103, "Devi");
		Student s5 = new Student(104, "Sarah");
		Student s6 = new Student(105, "James");

		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);
		c1.getStudents().add(s5);

		c2.getStudents().add(s1);
		c2.getStudents().add(s6);
		c2.getStudents().add(s4);
		c2.getStudents().add(s2);

		c3.getStudents().add(s1);
		c3.getStudents().add(s2);
		c3.getStudents().add(s3);
		c3.getStudents().add(s5);
		c3.getStudents().add(s6);

		ses.save(c1);
		ses.save(c2);
		ses.save(c3);

		ses.beginTransaction().commit();

		ses.close();
		sf.close();
		System.out.println("--- Done ---");

	}

}
