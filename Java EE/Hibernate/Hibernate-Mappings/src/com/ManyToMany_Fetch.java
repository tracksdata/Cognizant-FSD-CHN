package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Course;
import com.manytomany.Student;
import com.onetomany.Department;
import com.onetomany.Employee;
import com.onetoone.CapitalCity;
import com.onetoone.Country;

public class ManyToMany_Fetch {
	
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		
		Course c=ses.get(Course.class, 11);
		
		System.out.println("Course id: "+c.getCourseId());
		System.out.println("Course Name: "+c.getCourseName());
		
		
		for(Student s:c.getStudents()) {
			System.out.println("Student Id: "+s.getStudentId());
			System.out.println("name: "+s.getStudentName());
			System.out.println("--------------------------");
			
		}
		
		
		ses.close();
		sf.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
