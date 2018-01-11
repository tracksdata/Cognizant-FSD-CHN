package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test {
	public static void main(String[] args) {

		boolean result=true;
		
		while(result) {
		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter a No: ");
			int x = Integer.parseInt(br.readLine());
			System.out.println("No is " + x);
			result=false;

		} catch (Exception e) {
			System.out.println("Invalid Input. try again: ");
		}
		}// end of while
		System.out.println("-- End of Program");

	}

}
