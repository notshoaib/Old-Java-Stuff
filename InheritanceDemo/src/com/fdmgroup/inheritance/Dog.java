package com.fdmgroup.inheritance;

public class Dog extends Mammal{

	@Override
	public String breathe() {
		return "Dog breathes through mouth";
		
	}

	@Override
	public void running() {
		System.out.println("Dog is running");
		
	}

	@Override
	public void walking() {
		System.out.println("Dog is walking");
		
	}

}
