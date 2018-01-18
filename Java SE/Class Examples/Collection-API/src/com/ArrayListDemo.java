package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> arr=new ArrayList<>();
		arr.add(100);
		arr.add('A');
		arr.add("String");
		arr.add(100);
		arr.add(7663.34f);
		
		//arr.remove(1);
		
		Iterator<Object> it=arr.iterator();
		
		/*for(int i=0;i<arr.size();i++) {
			if(arr.get(i).equals('A')) {
				arr.remove(i);
			}
		}*/
		
	/*	while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals('A')) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}*/
		
		ListIterator<Object> li=arr.listIterator();
		
		
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals('A')) {
				//li.remove();
				//li.set('B');
				li.add("Praveen");
				//arr.add("Praveen");
				continue;
			}
			System.out.println(obj);
		}
		
		System.out.println("--------------------");
		System.out.println(arr);
		
		

	}

}
