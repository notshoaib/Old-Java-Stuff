package com.fdmgroup.abstractclassdemo;
/**
 * 
 * @author mohamad.salimi
 * @version 1.0
 */
public abstract class Mammal extends Animal {
	public static final int x=15;
	public Mammal() {
		
	}
	//This is the breed method
	public abstract void breed();
	
	/**
	 * This method will allow a mammal to walk
	 */
	public void walk(){
		System.out.println("Mammal is walking");
	}

}
