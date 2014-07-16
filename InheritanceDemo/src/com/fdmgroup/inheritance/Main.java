package com.fdmgroup.inheritance;

public class Main {

	public static void main(String[] args) {
		Mammal mammal = new Dog();
		Dog dog1=new Dog();
		Cat mammal2 = new Cat();
		
		System.out.println(dog1.breathe());
		System.out.println(mammal.breathe());
		System.out.println(mammal2.breathe());
		
		mammal.walking();
		
		mammal2.running();
		mammal2.running("Cat is running");
	}

}
