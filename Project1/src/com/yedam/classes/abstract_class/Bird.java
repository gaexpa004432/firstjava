package com.yedam.classes.abstract_class;

public class Bird extends Animal {
	
	public Bird(String kind) {
		super(kind);
	}
	public void sound(){
		System.out.println("새새");
	}
}
