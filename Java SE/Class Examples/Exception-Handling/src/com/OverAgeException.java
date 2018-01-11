package com;

public class OverAgeException extends RuntimeException {

	public OverAgeException(String msg){
		super(msg);
	}

	public OverAgeException() {

		// super("Age should not exceed more than 40 years");

	}

}
