package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	static class Member{
		String name;
		int age;
		Member(){
			
		}
		Member(String name,int age){
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	public static void main(String[] args) {
	List<Member> members = new ArrayList<>();
	members.add(new Member("hong",10));
	members.add(new Member("hwong",11));
	members.add(new Member("hou",12));
	for(Member mem : members) {
		System.out.println(mem.getName() + mem.getAge());
	}
	
	List<String> list = new ArrayList<String>();
	list.add("ㄱ");
	list.add("ㄴ");
	list.add("ㄷ");
	list.add("ㄹ");
	String str1 = list.get(1);
	list.remove(1);
	list.add(1,"slfl");
	for(int i=0 ; i< list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	
}
}
