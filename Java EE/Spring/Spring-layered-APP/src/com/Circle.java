package com;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("--- Drawing Circle");

	}
}
