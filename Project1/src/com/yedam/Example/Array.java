package com.yedam.Example;

public class Array {

	public static void main(String[] args) {
		int a[] = { 10, 8, 5, 3, 7, 1 };
		int temp = 0;
		for (int k = 0; k < a.length; k++) {
			for (int i = 0; i < a.length-1; i++) {

				if (a[i] > a[i + 1]) {

					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
