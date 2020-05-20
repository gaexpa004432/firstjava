package com.yedam.exceptions;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("쿸랠캘캘캘켈ㅋ엨레");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("에ㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔ옹");
	}
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Cat();
		try {
			changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("dd");
		}
	}

	public static void changeDog(Animal animal) throws ClassCastException {
		//try {
			Dog dog = (Dog) animal;
			dog.sound();
		//} catch (Exception e) {
		//	System.out.println("애ㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐ옹");
		}
	}

