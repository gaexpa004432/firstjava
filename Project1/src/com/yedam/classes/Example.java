package com.yedam.classes;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Student std = new Student();
		Scanner scan = new Scanner(System.in);
		Student std1 = new Student();
//		std.study();
		std.age = 10;
		std.height = 140;
		std.weight = 35;
		std.name = "lol";
//		std.eat("banana");

		std1.age = 1010;
		std1.height = 200;
		std1.weight = 500;
		std1.name = "baba";
//		std1.eat("부레인");

		// 배열의 값대신 클래스의 주소값을 저장해야함
		Troy[] T = new Troy[8];
//		Troy T1 = new Troy();
//		Troy T2 = new Troy();
//		T[0] = T1;
//		T[1] = T2;
		// String a = scan.nextLine();

		T[0].zombipc = "ddos ";
		T[0].dignosis();
		T[1].zombipc = "ddosd ";
		T[1].dignosis();
	}
}