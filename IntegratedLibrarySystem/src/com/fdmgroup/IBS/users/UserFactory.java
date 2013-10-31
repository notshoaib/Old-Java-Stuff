package com.fdmgroup.IBS.users;


public abstract class UserFactory {
	
	protected static Patron makeUser(String name) {
		return new Patron(name);
	}
	
	protected abstract Employee makeEmployee(String name);}
