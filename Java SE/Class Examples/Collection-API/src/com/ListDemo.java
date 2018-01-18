package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListDemo {

	public static void main(String[] args) {
			
		ArrayList<Object> arr=new ArrayList<>();
		arr.add(100);
		arr.add('A');
		arr.add("String");
		arr.add(100);
		arr.add(7663.34f);
		/*arr.add(100);
		arr.add(100);
		arr.add(100);
		arr.add(100);
		arr.add(100);
		arr.add(200);*/
		
		/*System.out.println(arr);
		System.out.println(arr.get(2));
		arr.remove(3);
		System.out.println(arr);
		arr.set(1, 'K');
		
		System.out.println(arr);*/
		//System.out.println(arr);
		
		//iterate using normal foro loop
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("---------------------");
		// with for each
		for(Object obj:arr) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------");
		// using iterator interface
		
		Iterator<Object> it=arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// using listiterator interface
		System.out.println("------------------------");
		
		ListIterator<Object> li=arr.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("-------------------------");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
