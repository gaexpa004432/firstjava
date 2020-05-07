package com.yedam.dev;

public class ArrayExample {

	public static void main(String[] args) {
		 int[] a = new int[6];
		 	int b= 0;
	        int temp = 0;
	        while(true) {
	        for (int i = 0; i < 6; i++) {
	            a[i] = (int) (Math.random() * 45) + 1;
	            for (int j = 0; j < i; j++) {
	                if (a[i] == a[j]) {									 //중복 제거
	                    a[i] = (int) (Math.random() * 45) + 1;
	                    j = 0;
	                    System.out.println("중복 제거");
	                }
	            }

	        }
	        for (int k = 0; k < 6; k++) { 								//숫자 오름차순 정렬
	            for (int i = 0; i < 5; i++) {
	                if (a[i] > a[i + 1]) {

	                    temp = a[i];
	                    a[i] = a[i + 1];
	                    a[i + 1] = temp;
	                }
	            }

	        }
	        for (int i = 0; i < 6; i++) {								//출력
	            System.out.println(a[i]);
	        }
	        if(a[0]==3 && a[1]==16 && a[2] == 21 && a[3] ==22 && a[4] == 23 && a[5] == 44) {
	        	System.out.println("당첨 시도횟수 = "+b);
	        	
	        	break;
	        }else {
	        	b++;
	        	System.out.println("낙첨"+b+"번 시도");
	        }
	}
	}
}
