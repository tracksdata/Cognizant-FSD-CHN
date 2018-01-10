package com;

public class Use {

	public static void main(String[] args) {
		
		Shape rect=new Shape() {
			
			@Override
			void draw() {
				System.out.println("-- Drawing a Rectangle");
				
			}
		};
		
		rect.draw();
		
		
	}
}
