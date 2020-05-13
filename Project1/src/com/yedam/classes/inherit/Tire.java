package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; // 수명
	public int accumulatedRotation;//현재 회전
	public String location;
	public Tire(String location ,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation ;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 수명  "+ (maxRotation - accumulatedRotation) + " 회 ");
			return true;
		}else {
			System.out.println(" 교체필요 "+location);
			return false;
		}
		
	}
}
