package com.yedam.classes.inherit;

public class KumhoTire extends Tire{
	public KumhoTire(String location , int maxRotation) {
		super(location, maxRotation);
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation ;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 금호 타이어 수명  "+ (maxRotation - accumulatedRotation) + " 회 ");
			return true;
		}else {
			System.out.println(" 교체필요 "+location);
			return false;
	}

}
}