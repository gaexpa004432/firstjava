package com.yedam.classes;

public class Calculator {
	String model;
	void powerOn(){
		System.out.println("power on");
		
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	public double minus(double a, double b) {
		return a-b;
	}
	public double divi(double a, double b) {
		return a/b;
	}
	void println(String str) {
		System.out.println("결과"+str);
	}
	void println(int str) {
		System.out.println("결과"+str);
	}
	void println(double str) {
		System.out.println("결과"+str);
	}
	double Squer(double str, double str2) {
		return str * str2;
	}
	double Squer(double str) {
		return str * str;
	}
}