package com;
public class CloneDemo implements Cloneable{

	/*
	 * Clonable interface
	 *  -------------------- 
	 *   marker / tagged interface
	 */
	
	String name;

	public void disp() {
		System.out.println("Name: " + name);
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		

		CloneDemo cd=new CloneDemo();
		cd.name="Ozvitha";
		cd.disp();
		
	    CloneDemo cd1=(CloneDemo) cd.clone();
	    cd1.name="Praveen";
	    System.out.println("--------");
	    cd1.disp();
	    cd.disp();
	    System.out.println(cd.hashCode());
	    System.out.println(cd1.hashCode());
		
		

	}

}
