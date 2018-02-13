package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class C1 {

}

public class Add {

	public int multiply(int x, int y) {

		return x * y;

	}

	public Object f2(Object c) {

		return c;
	}

	@Test
	public void f1() {
		
		Add tester = new Add();
		Object obj=new Object();
		assertEquals(10, tester.multiply(5, 2));
		assertEquals(obj, tester.f2(obj));
		
		if(obj instanceof Object) {
			//-----
		}else {
			// false
		}

		/*
		 * assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0"); assertEquals(0,
		 * tester.multiply(0, 10), "0 x 10 must be 0"); assertEquals(0,
		 * tester.multiply(0, 0), "0 x 0 must be 0");
		 */
	}

}
