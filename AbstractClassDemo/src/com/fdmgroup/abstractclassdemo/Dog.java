package com.fdmgroup.abstractclassdemo;

public class Dog extends Mammal implements Hunter, Bark {

	public Dog() {
		
	}

	@Override
	public void breed() {
		System.out.println("Dog is breeding");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}

	@Override
	public void sleep(int x) {
		System.out.println("Dog is sleeping for "+" "+x+"Hours");
		
	}
	
	@Override
	public void hunt(){
		System.out.println("Dog is hunting");
	}
	/**
	 * @return Returns a String which marks the dogs territory
	 */
	@Override
	public String markTerritory() {
		return "Dog is marking territory";
		
	}

	
	
	
}
