package com.yedam.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardAL {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardIN_IN in =new BoardIN_IN();
		BoardLI in1 =new BoardLI();
		List list = new ArrayList<>();
		while(true) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1. 입력  2. 수정  3. 삭제  4 .리스트");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		int a =scn.nextInt();
		if(a == 1) {
			in.insert();
		}else if(a ==2){
			
		}else if(a ==3){
			
		}else if(a ==4){
			
		}
	}
	}

}
