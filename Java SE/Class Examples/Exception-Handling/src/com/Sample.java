package com;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
	
		try {
			
			int i=-10;
			if(i<=0) {
				throw new NullPointerException();
			}
			int x=i/2;
			System.out.println(x);
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
		
	}

}
