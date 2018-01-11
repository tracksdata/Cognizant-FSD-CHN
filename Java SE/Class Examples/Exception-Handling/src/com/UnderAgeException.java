package com;

import java.io.IOException;

public class UnderAgeException extends RuntimeException {

	public UnderAgeException() {
		System.out.println("You must be above 18 years to proceed..");
	}

}
