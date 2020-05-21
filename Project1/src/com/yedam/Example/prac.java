package com.yedam.Example;

import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
		String q,w;
		int[] c = new int[3];
		c[0] = 1;
		c[1] = 2;
		int[] d = new int[3];
		d[0] = 1;
		d[1] = 2;
		int a[] = {1,2};
		int b[] = {1,2};
		
	System.out.println("배열 c,d equals 비교 : "+Arrays.equals(c,d));
	System.out.println("특정 인덱스 비교 "+ (c[1] == d[1]));
	System.out.println("배열 전체 일반 연산자 비교" +(c == d));
	System.out.println("해시코드 : "+ System.identityHashCode(c));
	System.out.println("해시코드 : "+System.identityHashCode(d));
	System.out.println("배열 c 주소 : "+c.toString());
	System.out.println("배열 d 주소 : "+d.toString());
	
	}

	
}
