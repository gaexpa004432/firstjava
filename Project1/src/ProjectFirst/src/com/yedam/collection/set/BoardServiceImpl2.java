package ProjectFirst.src.com.yedam.collection.set;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2 {
	List<Board> list = new ArrayList<>();
	

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board board) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSubject().equals(board.getSubject())) {
				list.get(i).setContents(board.getContents());
			}
		}
	}

	@Override
	public void deleteBoard(String subject) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getSubject().equals(subject)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void showBoard() {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}

}
