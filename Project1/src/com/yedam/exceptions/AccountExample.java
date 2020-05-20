package com.yedam.exceptions;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		try {
			account.withdraw(2000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("정상메뉴");
		}
		System.out.println("prog man");
	}

}
