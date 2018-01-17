package com;

class Abc {
	void f1() {
		System.out.println("-- f1 method");
	}
}

public class Sample<E> {

	void calc(E x) {
		Abc a = (Abc) x;
		a.f1();
		// int i=(int)x;
		// System.out.println("Value: "+i);
	}

	public static void main(String[] args) {

		Sample<Abc> s = new Sample<>();
		s.calc(new Abc());
		// s.calc(100);
		// s.calc(76);

		// s.calc('A');
		// s.calc("Praveen");
		// s.calc(76.45f);

	}

}
