package com.Pojo;

public class Library {
	public int id;
	public String bookTitle;
	public String author;
	public String genre;

	public Library(int id, String bookTitle, String author, String genre) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Library [book Title=" + bookTitle + ", author=" + author + ", genre=" + genre + " ]";
	}

}
