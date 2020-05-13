package com.yedam.classes.inherit;

public class UnivFriend extends Friend {
	
	String j;
	
	

	public UnivFriend() {
		super();
		
	}

	public UnivFriend(String name, String phone,String j) {
		super(name, phone);
		this.j = j;
		
	}
	
	
	public String getJ() {
		return j;
	}

	@Override
	public void showInfo() {
		System.out.println("이름 : " + name + " 번호 : "+phone + " 전공 : " + j);
	}
	

	
	
	
	

}
