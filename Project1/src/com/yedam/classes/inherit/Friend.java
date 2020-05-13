package com.yedam.classes.inherit;

public class Friend {
	//�ʵ�
	String name;
	String phone;
	
	
	public Friend() {
	}
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//�޼ҵ�
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
		System.out.println("이름 : " + name + " 번호 : "+phone);
	}

}
