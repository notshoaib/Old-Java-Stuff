package com.fdmgroup.overloadingdemo;

public class Child extends Parent {

	public Child() {
		super();
		System.out.println("In child constructor");
	}

	public void makeTrade() {
		System.out.println("Child is making a trade");
	}
	
	public void makeTrade(int amount){
		System.out.println("Child traded "+amount+" shares of tesla");
	}
	
	public void cry(){
		System.out.println("Child is crying");
	}

}
