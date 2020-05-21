package com.yedam.generic;

public class ProductExample {

	public static void main(String[] args) {
		Product<Apple,String> p1 = new Product<Apple,String>();
		p1.setKind(new Apple());
		p1.getKind();// Apple 타입
		p1.setModel("sda");
		String str = p1.getmodel();
		
		Product<String,Orange> p2 = new Product<String,Orange>();
		p2.setKind("오널ㄻ");
		p2.setModel(new Orange());
}

}
