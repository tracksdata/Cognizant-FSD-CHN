package com;

public class Use {

	public static void main(String[] args) {
		
		
		
		Employee emp=new Employee();
		emp.setData(1024, "Praveen");
		//emp.setData(1029, "Prashi");
		
		Employee emp1=new Employee();
		emp1.setData(1025, "James");
		
		Employee emp2=new Employee();
		emp2.setData(1025, "Ozvitha");
		
		emp.display();
		emp1.display();
		emp2.display();

	}

}
