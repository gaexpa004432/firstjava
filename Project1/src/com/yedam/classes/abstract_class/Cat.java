package com.yedam.classes.abstract_class;

public class Cat extends Animal {

	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("고양");
	}
	// public abstract void eat(); 추클 추메 가능
}
