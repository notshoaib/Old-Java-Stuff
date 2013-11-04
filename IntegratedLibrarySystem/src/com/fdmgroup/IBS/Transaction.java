package com.fdmgroup.IBS;

import com.fdmgroup.IBS.users.Patron;

public class Transaction {
	Book book;

	Patron patron;
	static int tID = 1000;
	int transID;
	boolean currentLoan = false;

	public Transaction(Book book, Patron patron) {
		this.book = book;
		this.patron = patron;
		settransID();
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

	public String toString() {
		String t = "Transaction #" + this.getTransID() + "Book Name: "
				+ this.getBook().getBookname() + "Patron Name: "
				+ this.getPatron().getName() + "Patron ID: ";
		return t;
	}

}
