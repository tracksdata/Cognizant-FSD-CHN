package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.onetoone.CapitalCity;
import com.onetoone.Country;

public class OneToMany_Fetch {
	
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Department dept= ses.get(Department.class, 1024);
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept Name: "+dept.getDeptName());
		
		for(Employee emp:dept.getEmps()) {
			System.out.println("EmpId: "+emp.getEmpId());
			System.out.println("EMp Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("---------------------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
