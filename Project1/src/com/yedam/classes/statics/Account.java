package com.yedam.classes.statics;

public class Account {
	private String ano,owner;
	private int balance;

	public Account() {

	}
	
	public Account(String ano,int balance, String owner) {
		super();
		this.ano = ano;
		this.balance = balance;
		this.owner = owner;
	}


	public void setBalance(int balance) {
		if (balance <0) {
			balance = this.balance;
		}else if(balance> 10000000) {
			balance = this.balance;
		}		
			this.balance += balance;
	}
	public void setBal(int balance) {
	if (this.balance < balance) {
		System.out.println("잔액이 부족합니다");
		
	}else {
	this.balance =	this.balance - balance;
	}
	}
	public int getBalance() {
		return balance;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
