package com.yedam.interfaces;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("onnnnnnnnnnnnnnnnnnnnnnnnnnn");
	}

	@Override
	public void turnOff() {
		System.out.println("offffffffffffffffffffffffff");
	}

}
