package com;

public class AgeDemo {

	public static void main(String[] args) {

		try {
			int age = 400;
			if (age < 18) {
				throw new UnderAgeException();
			}
			if (age > 40) {
				throw new OverAgeException("Age must be < 40");
			}
			System.out.println("Age is " + age);

		} catch (UnderAgeException |OverAgeException e) {
			
			System.out.println(e);
			
		}

	}
}
