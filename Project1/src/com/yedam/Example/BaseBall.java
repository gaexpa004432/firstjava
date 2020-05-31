package com.yedam.Example;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i <= 2; i++) {
			a[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) { // 중복 제거
					a[i] = (int) (Math.random() * 10);
					j = -1;
				}
			}
			System.out.println(a[i]);
		}
		while(true) {
		System.out.println("첫번째 값을 입력하시오");
		int num1 = scn.nextInt();
		System.out.println("두번째 값을 입력하시오");
		int num2 = scn.nextInt();
		System.out.println("세번째 값을 입력하시오");
		int num3 = scn.nextInt();
		int b[] = { num1, num2, num3 };
		int strike = 0;
		int ball = 0;
		for (int i = 0; i <= 2; i++) {
			if (a[i] == b[i]) {
				strike++;
			}
			for (int j = 0; j <= 2; j++) {
				if (i != j) {
					if (a[i] == b[j]) {
						ball++;
					}
				}
			}
		}
		if(strike == 3 ) {
			System.out.println("3 스트라이크");
			break;
		}
		
		System.out.println("스트라이크 :"+strike+" 볼 : "+ball);
		}
	}

}
