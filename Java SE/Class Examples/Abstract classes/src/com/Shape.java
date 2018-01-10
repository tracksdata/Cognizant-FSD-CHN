package com;

public abstract class Shape {
	public Shape() {
		System.out.println("--- Shape object created");
	}

	abstract void draw();

	public void shapeInfo() {
		System.out.println("-- Info abut Shape");
	}
}