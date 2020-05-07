package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
		int result = 0;
		int[] a = { 51, 35, 86, 48, 15, 25 };
		

		System.out.println(array(a));
	}

	public static int getLargeValue(int a, int b, int c) {
		if (a < b) {
			a = b;
		}
		if (a < c) {
			a = c;
		}
		return a;
	}

	public static int array(int[] a) {
		int temp = a[0]-1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > temp) {
				temp = a[i];

			}
		}
		return temp;
	}
	public static String getString(String str[]) {
		
		return str[1];
	}
}