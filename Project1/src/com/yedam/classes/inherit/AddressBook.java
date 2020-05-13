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
			System.out.println("1.ģ�� 2.���� 3.ȸ�� 4.�ּҷ� 5.�˻� 6.����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("�̸� : ");
				String ab = scn.next();

				System.out.println("��ȭ��ȣ : ");
				String abc = scn.next();
				Friend f1 = new Friend(ab, abc);
				f[i] = f1;
				i++;
			} else if (menu == 2) {
				System.out.println("�̸� : ");
				String ab = scn.next();

				System.out.println("��ȭ��ȣ : ");
				String abc = scn.next();
				System.out.println("���� : ");
				String abcd = scn.next();
				UnivFriend f1 = new UnivFriend(ab, abc, abcd);
				f[i] = f1;
				i++;
			} else if (menu == 3) {
				System.out.println("�̸� : ");
				String ab = scn.next();

				System.out.println("��ȭ��ȣ : ");
				String abc = scn.next();
				System.out.println("�μ� : ");
				String abcd = scn.next();

				CompFriend f1 = new CompFriend(ab, abc, abcd);
				f[i] = f1;
				i++;

			}
			else if (menu == 4) {
				System.out.println("�ּҷ� ����.");
				for (Friend acc : f) {
					if (acc != null) {
						acc.showInfo();
					}
				}
			}

			else if (menu == 5) {
				System.out.println("�˻��� �̸��� �Է��Ͻÿ� : ");
				String ab = scn.next();
				for (Friend acc : f) {
					if (acc != null) {
						if (acc.getName().equals(ab)) {
							acc.showInfo();
						}
					}
				}
			}else if (menu ==6 ){
				System.out.println("�����մϴ�.");
				break;
			}

			else {
				System.out.println("1~6�� ������ �־��ּ���.");
			}
		}  
	}

}
