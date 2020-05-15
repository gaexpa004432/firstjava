package com.yedam.interfaces;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("on");
	}

	@Override
	public void turnOff() {
		System.out.println("off"+ MAX_VOLUME);
	}

}
