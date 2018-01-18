package com;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();

		hs.add(87);
		hs.add(2);
		hs.add('A');
		hs.add(87);
		hs.add("Praveen");
		hs.add(34);
		
		

		System.out.println(hs);
	
		
		/*for(Object obj:hs) {
			System.out.println(obj);
			
		}*/
		
		Iterator<Object> it=hs.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			
			if(obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
						
		}
		System.out.println("---------------------------");
		
		System.out.println(hs);
		
		
		/*
		 * hs.remove('A'); System.out.println(hs);
		 */

	}

}
