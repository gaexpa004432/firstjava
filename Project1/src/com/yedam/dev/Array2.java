package com.yedam.dev;

public class Array2 {
	public static void main(String[] args) {
		double array[][] = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } }, a = 0, b = 0, c = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				a += array[i][j];
				b++;
			}
			c += array[i].length;
		}
		System.out.println((int)a);
		System.out.println(a / c);
		System.out.println(a / b);
	}
}
