package com;

import java.util.Date;

class Test {
	 int x=98;

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		
		//e1.salary=994797;// Not RM
		
		e1.setEmpId(1024);
		e1.setEmpName("Praveen");
		e1.setSalary(19734);
		
		e2.setEmpId(1025);
		e2.setEmpName("Ozvitha");
		e2.setSalary(39734);
		
		e3.setEmpId(1026);
		e3.setEmpName("Rose");
		e3.setSalary(48384);
		
		//System.out.println(e1.getSalary());
		
		e1.display();
		e2.display();
	    e3.display();
		

	}

}
