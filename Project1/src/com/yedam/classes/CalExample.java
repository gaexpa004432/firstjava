package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Calculator C1 = new Calculator();
		C1.powerOn();
		int result1= C1.sum(10, 50);
		double result2= C1.sum(10.3, 50.3);
		System.out.println(result1);
		System.out.println(result2);
		C1.println(result1);
		C1.println(result2);
		Calculator C2 = new Calculator();
		double a = C1.Squer(10,20);
		double b = C1.Squer(10);
		System.out.println(a);
		System.out.println(b);
		
	}
}
