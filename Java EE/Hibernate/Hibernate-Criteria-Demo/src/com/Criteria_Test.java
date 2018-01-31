package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Criteria_Test {

	public static void main(String[] args) {

		// 1. Load config file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Create Session Factory object

		SessionFactory sf = cfg.buildSessionFactory();

		// 3. Create a session from session factory

		Session ses = sf.openSession();

		Criteria cr = ses.createCriteria(Employee.class);
		// cr.add(Restrictions.eq("empId", 10));

		List<Employee> emps = cr.list();

		for (Employee emp : emps) {
			System.out.println("Empid: " + emp.getEmpId());
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("----------------------------");

		}

		ses.close();
		sf.close();

	}

}
