package com.yedam.api;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
		System.out.println(m1.toString());
		System.out.println(m2);
		System.out.println(m3);
		if(m1.equals(m2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		if(m1 == m2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
