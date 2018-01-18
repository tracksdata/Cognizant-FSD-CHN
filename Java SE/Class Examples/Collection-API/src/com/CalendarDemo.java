package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
	
		
		Date d=new Date("10/10/2010");
		//System.out.println("Date: "+d);
		
		Calendar cl=Calendar.getInstance();
		System.out.println(cl.getTime());// Calendar into Date Object
		
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH)+1);
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.HOUR));
		System.out.println(cl.get(Calendar.MINUTE));
		System.out.println(cl.get(Calendar.SECOND));
		System.out.println(cl.get(Calendar.MILLISECOND));
		System.out.println(cl.get(Calendar.HOUR_OF_DAY));// 24 hour format
		
		cl.add(Calendar.HOUR, -2);
		System.out.println(cl.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(cl.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SS a");
		System.out.println(sdf.format(cl.getTime()));
		
		//System.out.println(d.getYear()+1908);
		
		
		
		
		

	}

}
