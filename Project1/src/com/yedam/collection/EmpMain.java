package com.yedam.collection;

import java.util.Scanner;

public class EmpMain extends Exception {
	public static void m() {
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		EmpMain a = new EmpMain();
		while (true) {
			try {

				System.out.println("------------------------------");
				System.out.println("1.입력 2.리스트 3.수정 4.삭제 5.종료 ");
				System.out.println("------------------------------");
				System.out.print("선택> ");
				int menu = scn.nextInt();
				
				
				if (menu == 1) {
					System.out.println("사원번호 입력");
					int empid = scn.nextInt();
					System.out.println("성 입력");
					String name = scn.next();
					System.out.println("급여");
					int salary = scn.nextInt();
					System.out.println("입사일");
					String hiredate = scn.next();
					Employee emp = new Employee(empid, name, salary, hiredate);
					service.createEmp(emp);
				} else if (menu == 2) {
					service.getEmpList();

				} else if (menu == 3) {
					System.out.println("사원번호");
					int name = scn.nextInt();
					System.out.println("급여 입력");
					int salary = scn.nextInt();

					Employee emp = new Employee(name, "", salary, "");
					service.changeEmp(emp);
				} else if (menu == 4) {
					System.out.println("delete emp.No");
					int empid = scn.nextInt();
					service.removeEmp(empid);
				} else if (menu == 5) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("1~5의 정수를 입력해주세요");
				}
			} catch (Exception e) {
				a.m();
			}

		}
	}
}
