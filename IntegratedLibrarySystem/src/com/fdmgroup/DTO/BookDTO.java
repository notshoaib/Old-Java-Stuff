package com.fdmgroup.DTO;

public class BookDTO {
	String bookname;
	int ISBN;
	
	BookDTO(String bookname, int ISBN){
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
