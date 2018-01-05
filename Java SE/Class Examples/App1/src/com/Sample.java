package com;

public class Sample {
	/*
	 * Data types and variables
	 * 1. numbers
	 * 	-> int		-> 4 bytes
	 * 	-> short	-> 2 bytes
	 * 	-> long		-> 8 bytes
	 * 	-> byte		-> 1 byte
	 * 2. decimals
	 * 	-> float	-> 4 bytes
	 * 	-> double	-> 8 bytes
	 * 3. boolean
	 * 	-> boolean	-> 1 bit
	 * 4. character	->  UNICODE -> i18n
	 * 	-> char		-> 2 bytes
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int x=2147483647; // 4 bytes
		long l=214748364837374l; // 8 bytes
		
		double d=776.34;
		float f=875.34F;
		
		byte b=127;
		short s=32767;	
		
		char ch='A';
		String s1="AJGDSGDG";
		char c=97;
		boolean flag=false;
		
		System.out.println(flag);
		
		for(int i=65;i<=90;i++)
			System.out.print((char)i+" ");
		
		System.out.println();
		for(int i=97;i<=122;i++)
			System.out.print((char)i+" ");
		
		
		
		
		
		
		
	}

}
