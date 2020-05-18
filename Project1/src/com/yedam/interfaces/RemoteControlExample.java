package com.yedam.interfaces;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Audio audio = new Audio();
		RemoteControl rc = new Audio();
		RemoteControl tc = new Television();
		rc.turnOff();
		rc.turnOn();
		
		//익명갹채 인터페이스라도 생성가능 
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("dddd");
			}	

			@Override
			public void turnOff() {
				System.out.println("ssss");
			}
			
		};
		rc2.turnOff();
		rc2.turnOn();
	}

}
