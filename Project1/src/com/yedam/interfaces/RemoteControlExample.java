package com.yedam.interfaces;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Audio audio = new Audio();
		RemoteControl rc = new Audio();
		RemoteControl tc = new Television();
		rc.turnOff();
		rc.turnOn();
	}

}
