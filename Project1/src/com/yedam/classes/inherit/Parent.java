package com.yedam.classes.inherit;

public class Parent {
	private String lastname;
	private String firstname;
	private String telNumber;
	public Parent() {
		
	}
	public Parent(String lastname, String firstname, String telNumber) {
		super(); //최상위 클래스 오브젝트연결
		this.lastname = lastname;
		this.firstname = firstname;
		this.telNumber = telNumber;
	}
	
	String getLastname() {
		return lastname;
	}
	void setLastname(String lastname) {
		this.lastname = lastname;
	}
	protected String getFirstname() {
		return firstname;
	}
	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	@Override
	public String toString() {
		return "lastname ="+lastname + firstname;
		
	}
	
	

}
