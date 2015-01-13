package com.fdmgroup.overloadingdemo;

public class Parent {

	private String name;
	
	public Parent(String name) {
		super();
		System.out.println("In Parent 1 arg constructor");
		this.name=name;
	}
	
	public Parent(){
		this("No name");
		System.out.println("In parent no-arg constructor");
	}

	public void makeTrade() {
		System.out.println("Parent is making a trade");
	}
	
	public void payBills(){
		System.out.println("Paying the bills");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
