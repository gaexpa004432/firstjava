package com.yedam.dev;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0, b = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수 | 2.점수입력  | 3. 점수리스트 | 4. 분석  | 5. 종료  ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수 입력");
				int student = scanner.nextInt();
				scores = new int[student];
			} else if (selectNo == 2) {
				if (scores == null) {
					System.out.println("\n학생수를 먼저 입력해주세요. \n");
					continue;
				}
				b = 0;
				for (int a : scores) {
					System.out.println("성적 입력");
					int student = scanner.nextInt();
					scores[b++] = student;
				}
			} else if (selectNo == 3) {
				if (scores == null) {
					System.out.println("\n학생수를 먼저 입력해주세요. \n");
					continue;
				}
				b = 0;
				for (int a : scores) {
					System.out.println("학생 " + (b + 1) + "성적" + scores[b++]);
					System.out.println(a);
				}
			} else if (selectNo == 4) {
				if (scores == null) {
					System.out.println("\n 학생수를 먼저 입력해주세요. \n");
					continue;
				}
				b = 0;
				int c = scores[0] - 1;
				for (int a : scores) {
					studentNum += scores[b];
					if (scores[b] > c) {
						c = scores[b];
					}
					b++;
				}

				System.out.println("합계 =" + studentNum);
				System.out.println("평균 =" + (double) studentNum / scores.length);
				System.out.println("최고점 = " + c);
			} else if (selectNo == 5) {

				run = false;
			} else {
				System.out.println("\n올바른 숫자가 아닙니다 1~5의 정수를 입력해 주세요.\n ");

			}
		}
		System.out.println("프로그램 종료");

	}

}
