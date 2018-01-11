package com;

import java.util.Arrays;

import javax.xml.bind.attachment.AttachmentUnmarshaller;

public class WraperDemo {

	public static void main(String[] args) {

		//int x=1000;
		
		
		/*Integer i=x; // Auto Boxing
		int y=i; // Un-Boxing
		System.out.println(x);
		System.out.println(i);
		System.out.println(y);
		*/
		
		int x=100;
		float f=x;
		
		Integer i=500;
		float f1=i.floatValue();
		double d=i.doubleValue();
		long l=i.longValue();
		
		Float ff=new Float(45.67);
		int ii=ff.intValue();
		byte bb=ff.byteValue();
		
		System.out.println(Integer.max(1000, 200));
		int nos[]= {1,3,10,45,5};
		
		
		
		
		
		
		
		
		
		
		
	}
}
