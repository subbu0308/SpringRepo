package com.bpp.beans;

public class Ebook {
	
	private int bookId;
	private String title;
	private int size;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Ebook [bookId=" + bookId + ", title=" + title + ", size=" + size + "]";
	}
	
	

}
