package com.yedam.dev;

public class ArrayMethodExample {

	public static void main(String[] args) {
		int result =sum (10,11);
		int a[] = {1,2,3,4,5};
		double b[] = {1,2,3,4,5}, result1 =0;
		
		result = sumAry(a);
		result1 = sumDAry(b);
		System.out.println("더하기"+result);
		System.out.println("나누기"+result1);
	}
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	public static double sumDAry(double[] ary) {
		double sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum/ary.length;
	}
	public static int sum(int a, int b) {
	
	return a+b ;
	
	
	}
}
