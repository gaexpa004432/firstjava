package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
	public static void main(String[] args) {
		
	
	List<String> list = new ArrayList<>();
	long startTime, endTime;
	startTime = System.nanoTime();
	for(int i=0 ; i<10000 ;i++) {
		list.add(0,String.valueOf(i));
	}
	endTime = System.nanoTime();
	System.out.println(endTime - startTime);
	List<String> list1 = new LinkedList<>();
	startTime = System.nanoTime();
	for(int i=0 ; i<10000 ;i++) {
		list1.add(0,String.valueOf(i));
	}
	endTime = System.nanoTime();
	System.out.println(endTime - startTime);
}
}