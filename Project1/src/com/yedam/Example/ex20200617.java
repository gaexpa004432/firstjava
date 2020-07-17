package com.yedam.Example;

public class ex20200617 {
	public static void main(String[] args) {
		
	int[] a = new int[5];
	for (int i = 0; i <= a.length-1; i++) {
		a[i] = (int) (Math.random() * 10);
		for (int j = 0; j < i; j++) {
			if (a[i] == a[j]) { 
				a[i] = (int) (Math.random() * 10);
				j = -1;
			}
		}
		System.out.println(a[i]);
	}
	}
}
