package ProjectFirst.src.com.yedam.collection.set;

import java.util.List;

public class BoardServiceImpl1 implements BoardService {

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSubject().equals(board.getSubject())) {
				list.get(i).setContents(board.getContents());
			}
		}
		
	}

	@Override
	public void deleteBoard(List<Board> list, String subject) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getSubject().equals(subject)) {
				list.remove(i);
			}
		}
	}


	@Override
	public void showBoard(List<Board> list) {
		for(Board board : list) {
			System.out.println(board.toString());
		}
		
	}


	

}
