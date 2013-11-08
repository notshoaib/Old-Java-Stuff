package com.fdmgroup.IBS.users;

public abstract class UserFactory {

	protected static Patron makeUser(String firstname, String lastname) {
		return new Patron(firstname, lastname);
	}

	protected static Employee makeEmployee(String firstname, String lastname) {
		return new Employee(firstname, lastname);
	}
}
