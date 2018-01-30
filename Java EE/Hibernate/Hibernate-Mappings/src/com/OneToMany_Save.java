package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.onetoone.CapitalCity;
import com.onetoone.Country;

public class OneToMany_Save {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Employee e1 = new Employee(10, "Praveen", 93844);
		Employee e2 = new Employee(11, "Ozvitha", 1234);
		Employee e3 = new Employee(12, "James", 54545);
		Employee e4 = new Employee(13, "Bucky", 76757);
		Employee e5 = new Employee(14, "Sarah", 85643);

		Department dept = new Department();
		dept.setDeptId(1024);
		dept.setDeptName("HR");

		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);

		ses.save(dept);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
