package com.yedam.classes.statics;

import java.util.Scanner;

public class AccountApplication {
	private Scanner scn = new Scanner(System.in);
	private Account[] accounts = new Account[100];
	int i=0;

	private void createAccount() {
		System.out.println("계좌 생성");
		System.out.println("계좌 번호 입력");
	String	ano = scn.next();
		System.out.println("초기 금액 입력");
	int	bal = scn.nextInt();
		System.out.println("계좌 주입력");
	String	own = scn.next();
		Account a = new Account(ano, bal, own);
		accounts[i] = a;
		i++;
		
	}

	private void accountList() {
		System.out.println("계좌 목록");
		for (Account act : accounts) {
			if (act != null)
				System.out.println(act.getAno() + "  " + act.getOwner() + " " + act.getBalance());

		}
	}

	private void deposit() {
		System.out.println("예금 선택");
		System.out.println("계좌번호 입력");
		String ano = scn.next();
		for (Account acc : accounts) {
			if (acc != null) {
				if (acc.getAno().equals(ano)) {
					System.out.println("예금 금액 입력");
					int bal = scn.nextInt();
					System.out.println("잔액" + (acc.getBalance() + bal));
					acc.setBalance(acc.getBalance() + bal);
				} else {
					System.out.println("일치하는 계좌가 없습니다");
				}

			} else {
				break;
			}
		}
	}

	private void withdraw() {
		System.out.println("출금 선택");
		System.out.println("계좌 입력");
	String	ano = scn.next();
		for (Account acc : accounts) {
			if (acc != null) {
				if (acc.getAno().equals(ano)) {
					System.out.println("출금 금액 입력");
				int	bal = scn.nextInt();
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
	}
	private void findAccount() {
		String	anou = scn.next();
		for (Account acc : accounts) {
			if (acc != null) {
				if (acc.getAno().equals(anou)) {
					
					
					}
				}
	}
	}
	public void execute() {
		while (true) {
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("|1.생성 |2.목록 |3.예금 |4.출금 |5.종료| ");
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			int input = scn.nextInt();

			scn.nextLine();
			if (input != 1 && accounts[0] == null) {
				System.out.println("계좌를 먼저 생성하세요.");
				continue;
			}
			if (input == 1) {
				createAccount();
			} else if (input == 2) {
				accountList();
			} else if (input == 3) {
				deposit();
			} else if (input == 4) {
				 withdraw();
			} else if (input == 5) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("1~5의 정수를 넣어주세요 ");
			continue;
			}
		}
	}
}
