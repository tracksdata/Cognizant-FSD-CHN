package com;

public class Demo {

	void fun() {

	}

	public static void main(String[] args) {

		System.out.println("Hi");

		try {
			Demo d = null;
			d.fun();
			int i = 10 / 10;
			int x[] = { 10, 20 };
			System.out.println("X: " + x[10]);
		}
		//  no declarations
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Failed due to " + e);
		} catch (ArithmeticException ae) {
			System.out.println("Failed due to " + ae);
		} catch (NullPointerException ne) {
			System.out.println("failed due to " + ne);
		} catch (Exception e) {
			System.out.println("failed due to " + e);
			
			e.printStackTrace();
			
		}
		//Must not  Define any statements
		finally {

			System.out.println("-- Always executed");
		}

		System.out.println("Hello");

	}
}
