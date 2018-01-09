package com;


public class Use {

	public static void main(String[] args) {
		// Approach -1 
		/*
		Circle c=new Circle();
		c.draw();
		Square s=new Square();
		s.draw();*/
		
		// Approach- 2 - Recamended
		
		Shape s;
		s=new Circle();
		s.draw();
		s.copyRights();
		
		
		s=new Square();
		s.draw();
		s.copyRights();
		
		
		
		
		
		
	}
}
