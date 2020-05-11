package com.yedam.classes.statics;

public class Car {
	private int speed; 
	private boolean stop;//디폴트 false

//	Car(int speed){
//		this.speed = speed;
//	}
	void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			System.out.println("양수입력");
		} else {
			this.speed = speed;
		}
	}
	int getSpeed(){
		return this.speed;
	}
	
	public boolean getStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
}
