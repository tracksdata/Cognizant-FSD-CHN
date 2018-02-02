package com;

import org.springframework.stereotype.Component;

@Component("square")
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("-- Drawing Square");

	}

}
