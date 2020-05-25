package com.yedam.collection;

import java.util.*;
class Member{
	String name;
	int age;
	Member(String name , int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name +this.age;
	}
	@Override
	public int hashCode() {
		return this.age;
	}
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<Member> set1 = new HashSet<>();
		set1.add(new Member("honh",10));
		set1.add(new Member("honk",20));
		set1.add(new Member("honh",10));
		
		for(Member member:set1) {
			System.out.println(member.toString());
		}
		
		set.add("sgsgs");
		set.add("1252512");
		set.add("sfdlam222");
		
		for(String str : set) {
			System.out.println(str.toString());
		}
	}
}
