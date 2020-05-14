package com.yedam.exceptions;

public class NullPointerExceptions {

	public static void main(String[] args) {
		String str = "ㅇ";
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		} catch (NullPointerException e) {
			System.out.println("에러발생");
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스 입니다.");
		} catch (Exception e) {
			System.out.println("알수없는 예외발생");
		}
		System.out.println("프로그램 종료");

	}

}
