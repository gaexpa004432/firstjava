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
			System.out.println("양수만 가능합니다");
		}
		this.balance =	 balance;
	}
	public void setBal(int balance) {
	

		
	
	this.balance =	balance;
	
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
