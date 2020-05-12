package com.yedam.classes.inherit;

public class Cellphone {
	String model;
	String color;

	Cellphone(String model, String color) {
		this.model = model;
		this.color = color;

	}

	void powerOn() {
		System.out.println("power on");
	}

	void bell() {
		System.out.println("bell");
	}

	void sendVoices(String message) {
		System.out.println(message);
	}

	void receiveVoices(String message) {
		System.out.println(message);
	}

	void powerOFF() {
		System.out.println("off");
	}
}
