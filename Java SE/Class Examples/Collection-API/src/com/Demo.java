package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
	
		
		HashSet<Object> hs=new HashSet<>();
		

		hs.add(100);
		hs.add(10);
		hs.add(200);
		
		//Object[] objs=hs.toArray(); // converts set as array
		
		String cities[]= {"CHN","HYD","Del","GOA"};
		
		ArrayList<String> arr1=new ArrayList<>();
		
		
		
		ArrayList<Object> arr=new ArrayList<>(hs);
		
		
		System.out.println(arr);
		/*arr.add(10);
		arr.add(40);
		arr.add(60);
		arr.add(10);
		arr.add(100);
		*/
	
		
		
		
		//hs.retainAll(arr);
		
		//System.out.println(hs);
		
		
		
	}

}
