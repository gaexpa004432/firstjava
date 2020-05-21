package com.yedam.generic;

public class PairExample {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair<Integer,String>(1,"wjwj");
		Pair<Integer,String> p2 = new Pair<Integer,String>(2,"wjwj");
		if(Utils.compare(p1,p2)) {
			System.out.println("equals");
		}else {
			System.out.println("different");
		}
		
		int result = Utils.compare(10, 20);
		System.out.println(result);
		
		
	}

}
