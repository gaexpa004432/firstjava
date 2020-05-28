package com.yedam.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx {
	public static void main(String[] args) {
		List<ListBO> list = new ArrayList<>();
		int i =0;
		Scanner scn =new Scanner(System.in);
		while(true) {
		String title = scn.next();
		String content = scn.next();
		ListBO lb =new ListBO(title,content);
		list.add(lb);
	    list.get(i++).getTitle().equals(title);
	    list.get(i++).setTitle(title);
		System.out.println("");
		}
	}
}
