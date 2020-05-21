package com.yedam.classes;

public class String1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(int1.equals(int2));
		System.out.println(int1 == int2);
		System.out.println(str4);
		
		
		
		
	}

}
