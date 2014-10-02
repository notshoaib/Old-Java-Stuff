package com.fdmgroup.abstractclassdemo;

public class Cat extends Mammal implements Bark{

	public Cat() {
		
	}

	@Override
	public void breed() {
		System.out.println("Cat breeding");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}

	/**This method causes an animal to sleep
	 * @param hours specifies how long a cat will sleep
	 */
	@Override
	public void sleep(int hours) {
		System.out.println("Cat is sleeping for "+hours +" "+hours);
		
	}
	
	@Override
	public void walk(){
		System.out.println("Cat is walking like a human");
	}
	
	public String markTerritory(){
		return "cat meow";
	}
	
	
	
	
	
	
	
	
	
	

}
