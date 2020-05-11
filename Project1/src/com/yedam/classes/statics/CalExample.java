package com.yedam.classes.statics;

public class CalExample {

	public static void main(String[] args) {
		Calculator C1 = new Calculator();
		Calculator.pi = 3.14159;
		Calculator.sum(50, 80);
		
		Car C2 = new Car();
		C2.setSpeed(60);
		C2.getSpeed();
		System.out.println(C2.getSpeed());
		if (C2.getStop()) {
			C2.setStop(true);
		}
		System.out.println(C2.getSpeed());
	}

}
