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
		System.out.println("�̸� : " + name + " ��ȭ��ȣ : "+phone + " �μ� : " + Buseo);
	}

}
