package com.fdmgroup.loginservlet;

public class DTO {

	String id;
	String firstname;
	String lastname;
	String ISBN;
	String bookname;
	
	DTO(String id, String firstname, String lastname){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	DTO(String ISBN, String bookname){
		this.ISBN=ISBN;
		this.bookname=bookname;
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
