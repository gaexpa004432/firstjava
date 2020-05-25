package com.yedam.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class BoardLI{
	public String name;
	public String word;
	public String person;
	
	public BoardLI() {
	}

	public BoardLI(String name,String word,String Person){
		this.name = name;
		this.word = word;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	
}

public class BoardIN_IN implements BoardIN {
	Scanner scn = new Scanner(System.in);
	List list = new ArrayList<>();
	@Override
	public void insert() {
		
		String a =scn.next();
		String b =scn.next();
		String c =scn.next();
		
		BoardLI board = new BoardLI(a,b,c);
		list.add(board);
		System.out.println();
	}

	@Override
	public void modify() {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void list() {
		
	}

}
