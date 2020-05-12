package com.yedam.classes.inherit;

public class DmbCellPhone extends Cellphone{
	int channel ;

	public DmbCellPhone(String model, String color) {
		super(model, color);
		
	}
	public DmbCellPhone(String model, String color ,int channel) {
		super(model, color);
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println(channel);
	}
	void changeChannel (int channel) {
		this.channel = channel;
		System.out.println(channel);
	}
	void turnOFFDmb() {
		System.out.println("종료");
	}
	@Override
	void powerOn() {
		super.powerOn();
	}
	@Override
	void powerOFF() {
	}
	
}
