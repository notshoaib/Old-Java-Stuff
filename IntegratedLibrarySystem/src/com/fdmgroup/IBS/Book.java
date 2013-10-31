package com.fdmgroup.IBS;

public class Book {
	String bookname;
	int ISBN;
	
	public Book(int ISBN,String bookname){
		this.bookname=bookname;
		this.ISBN=ISBN;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

}
