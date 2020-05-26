package ProjectFirst.src.com.yedam.collection.set;

public class Board {
	String subject;
	String contents;
	String writer;
	
	
	Board() {
	
	}
	
	Board(String subject, String contents,String writer) {
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}

	
	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	@Override
	public String toString() {
		return this.subject + ", " + this.contents +  ", " + this.writer;
	}
	

}
