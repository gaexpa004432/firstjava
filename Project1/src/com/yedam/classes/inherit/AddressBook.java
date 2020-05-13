package com.yedam.classes.inherit;

import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class AddressBook {

	public static void main(String[] args) {
		Friend[] f = new Friend[99];
		int i = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.친구 2.대학 3.회사 4.리스트 5.검색 6.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름 : ");
				String ab = scn.next();

				System.out.println("번호 : ");
				String abc = scn.next();
				Friend f1 = new Friend(ab, abc);
				f[i] = f1;
				i++;
			} else if (menu == 2) {
				System.out.println("이름 : ");
				String ab = scn.next();

				System.out.println("번호 : ");
				String abc = scn.next();
				System.out.println("전공 : ");
				String abcd = scn.next();
				UnivFriend f1 = new UnivFriend(ab, abc, abcd);
				f[i] = f1;
				i++;
			} else if (menu == 3) {
				System.out.println("이름 : ");
				String ab = scn.next();

				System.out.println("번호 : ");
				String abc = scn.next();
				System.out.println("부서 : ");
				String abcd = scn.next();

				CompFriend f1 = new CompFriend(ab, abc, abcd);
				f[i] = f1;
				i++;

			}
			else if (menu == 4) {
				System.out.println("리스트");
				for (Friend acc : f) {
					if (acc != null) {
						acc.showInfo();
					}
						
					
				}
			}

			else if (menu == 5) {
				System.out.println("검색 이름 : ");
				String ab = scn.next();
				for (Friend acc : f) {
					if (acc != null) {
						if (acc.getName().equals(ab)) {
							acc.showInfo();
						}else {
							System.out.println("검색 결과가 없습니다.");
						}
					}
				}
			}else if (menu ==6 ){
				System.out.println("종료.");
				break;
			}

			else {
				System.out.println("1~6의 정수를 입력해 주세요 .");
			}
		}  
	}

}
