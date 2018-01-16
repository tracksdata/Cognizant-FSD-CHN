package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DataFileDemo {

	public static void main(String[] args) {
		try {
			
			InputStreamReader isr=new InputStreamReader(System.in);
			//DataInputStream dis=new DataInputStream(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			
			System.out.println("Enter No: ");
			int x=Integer.parseInt(br.readLine());
			System.out.println("X: "+x);
			
			System.out.println("Input a character: ");
			char ch=(char)br.read();
			br.readLine();// skips enter  press
			System.out.println("Character is  "+ch);
			
			System.out.println("Enter a String: ");
			String s1=br.readLine();
			System.out.println("String is "+s1);
			
			
			
		} catch (Exception e) {
			System.out.println("Failed  due  to "+e);
		}

	}

}
