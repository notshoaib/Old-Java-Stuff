package com.fdmgroup.IBS;

public class Book {
	String bookname;
	String ISBN;
	
	public Book(String ISBN,String bookname){
		this.bookname=bookname;
		this.ISBN=ISBN;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getISBN() {
		return ISBN;
	}

	public String setISBN(String ISBN) {
		ISBN = ISBN;
		return ISBN;
	}

}
