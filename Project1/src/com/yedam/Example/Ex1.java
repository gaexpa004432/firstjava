package com.yedam.Example;

public class Ex1 {

	public static void main(String[] args) {
		int a =1;
		for(int i = 0 ;i <5 ; i++) {
			for(int j = 0; j< 5 ; j++) {
				
				System.out.print(a+"\t");
				a++;
			}
			System.out.println("\n");
		}
	
		int b = 1 ;
	for(int i = 1 ;i <6 ; i++) {
		for(int j = 0; j< 5 ; j++) {
		
			System.out.print(b+"\t");
			b += 5;
			
		}
		b = i+1;
		System.out.println("\n");
	}
}

}
