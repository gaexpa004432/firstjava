package com.yedam.interfaces;

public interface RemoteControl {
	//인터페이스는 상수값만 받을수 있음 final static
	public int MAX_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
}
