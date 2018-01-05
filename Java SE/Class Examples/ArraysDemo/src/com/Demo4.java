package com;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		// sc.nextLine();
		System.out.println("Age is " + age);
		System.out.println("Ennter a String");
		String s1 = sc.nextLine();
		System.out.println(s1);

	}

}
