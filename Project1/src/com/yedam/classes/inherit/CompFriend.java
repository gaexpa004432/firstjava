package com.yedam.classes.inherit;

public class CompFriend extends Friend {
	
	String Buseo;

	public CompFriend() {
		super();
	}

	public CompFriend(String name, String phone, String Buseo) {
		super(name, phone);
		this.Buseo = Buseo;
	}
	
	@Override
	public void showInfo() {
		System.out.println("이름 : " + name + " 전화번호 : "+phone + " 부서 : " + Buseo);
	}

}
