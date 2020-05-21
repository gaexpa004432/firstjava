package com.yedam.generic;
class Apple{
	
}
class Orange{
	
}
public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Alrrar");
		System.out.println(box.get());
		String str =box.get();
		
		Box<Apple> appleBox = new Box<Apple>(); //선언한시점에 타입이 결정됨 <T>
		
		//appleBox.set("sa");
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		System.out.println(appleBox.get());
//		
//		box.set(new Orange());
//		Orange orange =(Orange)box.get();
}

}
