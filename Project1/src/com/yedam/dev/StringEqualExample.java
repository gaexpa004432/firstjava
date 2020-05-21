package com.yedam.dev;

class Student {
	String name;
}

public class StringEqualExample {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		str1 = str2;
		if (str1 == str2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");

		}
	}
}
