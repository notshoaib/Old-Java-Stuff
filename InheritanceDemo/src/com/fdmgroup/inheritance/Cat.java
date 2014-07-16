package com.fdmgroup.inheritance;

public class Cat extends Mammal {

	@Override
	public String breathe() {
		
		return "Cat breathes through Mouth";
	}

	@Override
	public void running() {
		System.out.println("Cat is running");
		
	}
	
	public void running(String msg){
		System.out.println(msg);
	}

	@Override
	public void walking() {
		System.out.println("Cat is walking");
		
	}

}
