package ProjectFirst.src.com.yedam.collection.set;

import java.util.Scanner;

public class BoardMain2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		BoardService2 service = new BoardServiceImpl2();

		while (true) {
			System.out.println("===================================");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("===================================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.print("제목입력 : ");
				String subject = scn.nextLine();
				System.out.print("내용입력 : ");
				String contents = scn.nextLine();
				System.out.print("작성자입력 : ");
				String writer = scn.nextLine();
				Board board = new Board(subject, contents, writer);
				service.insertBoard(board);

			} else if (menu == 2) {
				System.out.print("제목입력 : ");
				String subject = scn.nextLine();
				System.out.println("변경내용입력 : ");
				String contents = scn.next();
				Board board = new Board(subject, contents, null);
				service.updateBoard(board);

			} else if (menu == 3) {
				System.out.print("제목입력 : ");
				String subject = scn.nextLine();
				service.deleteBoard(subject);

			} else if (menu == 4) {
				service.showBoard();

			} else if (menu == 5) {
				break;
			}

		}
		System.out.println("end of prog.");

	}
}
