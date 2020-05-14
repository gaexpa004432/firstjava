package com.yedam.classes.abstract_class;

public class AnimalExample {

	public static void main(String[] args) {
	//	Animal animal = new Animal();
		Animal b = new Bird("나비");
		Cat c= new Cat("개");
		b.breathe();
		c.sound();
		b.sound();
		System.out.println(c.kind);
	}

}
