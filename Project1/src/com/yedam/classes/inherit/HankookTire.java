package com.yedam.classes.inherit;

public class HankookTire extends Tire{
	public HankookTire(String location , int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation ;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국 타이어 수명 "+ (maxRotation - accumulatedRotation) + " 회 ");
			return true;
		}else {
			System.out.println(" 교체필요 "+location);
			return false;
	}
	
}
}
