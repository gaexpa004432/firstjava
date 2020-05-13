package com.yedam.classes.inherit;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		vehicle = new Bus(); //자식은 자신형태의 변수를 만들지않아도 부모클래스 형태에 형변환 가능
		vehicle.run();
		vehicle = new Taxi();
		vehicle.run();
		
		Taxi taxi = (Taxi)vehicle; //부모형태는 자식형태로 형변환 불가 강제 형변환 필요 (Taxi)
		taxi.run();
		
	}

}
