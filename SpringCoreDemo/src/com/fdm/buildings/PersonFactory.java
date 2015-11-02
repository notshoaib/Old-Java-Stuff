package com.fdm.buildings;

public class PersonFactory {

	public PersonFactory() {
		
	}
	
	public static Person getPerson(){
		
		return new Person("Daniel Jurin", "Software Developer");
		
	}

}
