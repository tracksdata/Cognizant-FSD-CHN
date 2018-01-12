package com;

public class AgeDemo {

	public static void main(String[] args) throws UnderAgeException {

		try {
			int age = 400;
			if (age < 18)
				try {
					{
						throw new UnderAgeException();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (age > 40) {
				throw new OverAgeException("Age must be < 40");
			}
			System.out.println("Age is " + age);

		} catch (OverAgeException e) {
			
			System.out.println(e);
			
		}

	}
}
