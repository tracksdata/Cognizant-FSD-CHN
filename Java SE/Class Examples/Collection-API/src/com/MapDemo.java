package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapDemo {
	
	public static void main(String[] args) {
	
		HashMap<Integer, Object> hm=new HashMap<>();
	
		hm.put(15, "Praveen");
		hm.put(11, "John");
		hm.put(21, 'A');
		hm.put(14, 100);
		hm.put(76, 763);
		
		// Copy all keys into set interface.
		
		Set s= hm.keySet(); // copies all map keys into set interface
		
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println(hm.get(key));
			
		}
		
		Set<Map.Entry<Integer, Object>> s1= hm.entrySet();// copies key and values as set
		System.out.println(s1);
		
		
		//hm.put(null,"Abc");
		//hm.put("Xyz", null);
		
		
		//System.out.println(hm);
		
	}
	
	

}
