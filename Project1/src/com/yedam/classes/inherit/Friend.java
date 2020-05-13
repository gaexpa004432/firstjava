package com.yedam.classes.inherit;

public class Friend {
	//필드
	String name;
	String phone;
	
	
	public Friend() {
	}
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 전화번호 : "+phone);
	}

}
