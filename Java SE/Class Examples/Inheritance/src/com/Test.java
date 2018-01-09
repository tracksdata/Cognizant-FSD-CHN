package com;

 class God {
	
	void talk() {
		System.out.println("?");
	}
}
class Dog extends God{
	
	@Override // Annotation -> Java 5.0
	void talk() {
		System.out.println("Bow Bow");
	}
	
}

class Cat{
	void talk1() {
		System.out.println("Meow Meow ");
	}
}


class Test{
	public static void main(String[] args) {
		
		
		/*Animal a=new Animal();
		a.talk();*/
		Dog d=new Dog();
		d.talk();
		
		Cat c=new Cat();
		c.talk1();
		
	}
	
}


