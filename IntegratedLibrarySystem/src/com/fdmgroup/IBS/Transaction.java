package com.fdmgroup.IBS;

import com.fdmgroup.IBS.users.Patron;

public class Transaction {
	Book book;

	Patron patron;
	static int tID = 1000;
	int transID;
	boolean currentLoan = false;
	String ISBN;
	int userID;

	public Transaction(int userID, String ISBN) {
		this.userID = userID;
		this.ISBN=ISBN;
		settransID();
	}
	public Transaction(int transID, int userID, String ISBN) {
		this.transID = transID;
		this.userID = userID;
		this.ISBN=ISBN;
	}

	public void settransID() {
		this.transID = tID;
		tID += 7;

	}

	public int getTransID() {
		return transID;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public boolean iscurrentLoan() {
		return currentLoan;
	}

	public void setcurrentLoan(boolean currentLoan) {
		this.currentLoan = currentLoan;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book b) {
		this.book = b;
	}

	public Patron getPatron() {
		return patron;
	}

	public void setPatron(Patron p) {
		this.patron = p;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}


}
