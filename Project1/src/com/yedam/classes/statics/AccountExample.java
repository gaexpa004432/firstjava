package com.yedam.classes.statics;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Account[] account = new Account[99];
		Scanner scn = new Scanner(System.in);
		int input, bal, i = 0;
		String ano, own;
		while (true) {
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("|1.생성 |2.목록 |3.예금 |4.출금 |5.종료| ");
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			input = scn.nextInt();

			scn.nextLine();
			if (input != 1 && account[0] == null) {
				System.out.println("계좌를 먼저 생성하세요.");
				continue;
			}
			if (input == 1) {
				System.out.println("계좌 생성");
				System.out.println("계좌 번호 입력");
				ano = scn.next();
				System.out.println("초기 금액 입력");
				bal = scn.nextInt();
				System.out.println("계좌 주입력");
				own = scn.next();
				Account a = new Account(ano, bal, own);
				account[i] = a;
				i++;
			} else if (input == 2) {
				System.out.println("계좌 목록");
				for (Account act : account) {
					if (act != null)
						System.out.println(act.getAno() + "  " + act.getOwner() + " " + act.getBalance());

				}
			} else if (input == 3) {

				System.out.println("예금 선택");
				System.out.println("계좌번호 입력");
				ano = scn.next();
				for (Account acc : account) {
					if (acc != null) {
						if (acc.getAno().equals(ano)) {
							System.out.println("예금 금액 입력");
							bal = scn.nextInt();
							System.out.println("잔액" + (acc.getBalance() + bal));
							acc.setBalance(acc.getBalance() + bal);
						} else {
							System.out.println("일치하는 계좌가 없습니다");
						}

					} else {
						break;
					}
				}
			} else if (input == 4) {

				System.out.println("출금 선택");
				System.out.println("계좌 입력");
				ano = scn.next();
				for (Account acc : account) {
					if (acc != null) {
						if (acc.getAno().equals(ano)) {
							System.out.println("출금 금액 입력");
							bal = scn.nextInt();
							if (acc.getBalance() < bal) {
								System.out.println("잔액이 부족합니다");
								continue;
							} else {
								acc.setBal(acc.getBalance() - bal);
								System.out.println("잔액" + acc.getBalance());
							}
						} else {

							System.out.println("일치하는 계좌가 없습니다");
						}
					} else {
					}
				}
			} else if (input == 5) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("1~5의 정수를 입력해 주세요");
			}
		}

	}
}
