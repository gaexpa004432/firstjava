package com.yedam.interfaces;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		cal.set(2020,4,2); // 특정날로 설정 년,월(0월부터 시작),일
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 몇일인지 리턴
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 달의 특정 일 요일 숫자로 리턴 
	//	Scanner scn = new Scanner(System.in);
	//	System.out.println("월 입력");
	//	int a = scn.nextInt();
		//getLatDay(5);
		int a = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(a);
		getDayofWeek(a,5);
	}
	public static void showCal(int year, int month) {
		int today =0;
		System.out.println("Sun\tMon\tTue\tWed\tThr\tFri\tSat");
		for(int i=0 ; i<month ; i++) {
			System.out.print((today+++1) +"\t");// -10
//			System.out.printf("%3s",today);// -10
			
			if(today % 7 == 0)  {
				System.out.println();
			
			}
		}
	}
	public static int getLatDay(int month) {
		int lastDay =0;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDay =31;
			showCal(2020,lastDay);
		}else if(month ==2) {
			lastDay =29;
			showCal(2020,lastDay);
		}else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
			lastDay =30;
		showCal(2020,lastDay);
		}
		return 1;
	}
	public static int getDayofWeek(int week , int month) {

		if(week == 1 ) {
			System.out.println("일요일");
		}else if((week == 2)){
			System.out.println("월요일");
		}else if((week == 3)){
			System.out.println("화요일");
		}else if((week == 4)){
			System.out.println("수요일");
		}else if((week == 5)){
			System.out.println("목요일");
		}else if((week == 6)){
			System.out.println("금요일");
		}else if((week == 7)){
			System.out.println("토요일");
		}
		getLatDay(month);
		return 1;
	}
}
