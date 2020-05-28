package com.yedam.Example;

import java.util.ArrayList;

public class ListBO {
	String title;
	String content;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ListBO(String title, String content) {
		this.title = title;
		this.content = content;
	}
	@Override
	public String toString() {
		return "ListBO [title=" + title + ", content=" + content + "]";
	}
	
	
}
