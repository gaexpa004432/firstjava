package ProjectFirst.src.com.yedam.collection.set;

import java.util.List;

public interface BoardService {

	abstract void insertBoard(List<Board> list, Board board);  //입력

	void updateBoard(List<Board> list, Board board);  //수정

	void deleteBoard(List<Board> list, String subject);  //삭제
	
	void showBoard(List<Board> list);  //리스트

}
