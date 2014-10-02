package com.fdmgroup.abstractclassdemo;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Mammal dog = new Dog();
		Mammal cat = new Cat();

		// cat.eat();
		//
		// cat.breed();
		//
		//
		// dog.walk();
//		cat.walk();

		// dog=new Cat();
		// assert(dog instanceof Dog): "Dog is not an instance of class Dog";

//		Object o = 55;
//		System.out.println(o.getClass());

		if (dog instanceof Dog) {

			((Dog) dog).markTerritory();
		} else
			System.out.println("dog is not an instance of class Dog");
		 
		
		 
		 
		 
		 
		 
		 
		 
		
			
			
			
			
			
			
			
			
			
			

	}

}
