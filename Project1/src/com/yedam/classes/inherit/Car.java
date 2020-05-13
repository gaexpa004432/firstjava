package com.yedam.classes.inherit;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		/*frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backLeftTire.roll();*/
		if (frontLeftTire.roll() == false) {
			return 1;
		}
		if (frontRightTire.roll() == false) {
			return 2;
		}
		if (backLeftTire.roll() == false) {
			return 3;
		}
		if (backRightTire.roll() == false) {
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("stop");
	}
}
