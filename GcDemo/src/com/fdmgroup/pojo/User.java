package com.fdmgroup.pojo;

public class User extends Person {

	private String username;

	public User(String username) {
		this.username = username;
		System.out.println("User created");

	}

	public User() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void study(String subject) {
		System.out.println("User is studying " + subject);
	}

	public void study() {
		System.out.println("User is not studying");
	}

	@Override
	public void finalize() {
		System.out.println("User object being destroyed");
	}

	@Override
	public void sleep() {
		System.out.println("User is sleeping");
	}

}
