package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		// 1. Load config file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Create Session Factory object

		SessionFactory sf = cfg.buildSessionFactory();

		// 3. Create a session from session factory

		Session ses = sf.openSession();

		Query<Employee> qry = ses.createQuery("from Employee");

		List<Employee> emps = qry.list();

		for (Employee emp : emps) {
			System.out.println("EmpId: " + emp.getEmpId());
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("----------------------------------");
		}

		ses.close();
		sf.close();

	}

}
