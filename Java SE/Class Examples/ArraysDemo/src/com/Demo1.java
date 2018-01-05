package com;

public class Demo1 {
	/*
	 * Arays ------ Collection of Same adata type Two Types -> 1 -D -> 2 -D
	 * 
	 * 1-D -----
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int x[] = { 10, 20, 30, 40, 50, 100 };
		//System.out.println(x.length);
		//System.out.println(x[0]);

		// for Each -> Enhanced loop in JDK 5.0 and above
		// Only to Iterate Elements of an Array

		for (int j : x) {
			System.out.println(j);
		}
		System.out.println("________________________");

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("--------------");

	}

}
