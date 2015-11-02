package com.fdm.buildings;

import javax.annotation.Resource;

public class House extends Building {

//	@Autowired
//	@Qualifier("gangyang")
	@Resource(name="gangyang")
	private Person headOfHousehold;

	public Person getHeadOfHousehold() {
		return headOfHousehold;
	}

	public void setHeadOfHousehold(Person headOfHousehold) {
		this.headOfHousehold = headOfHousehold;
	}
	
	
	public void init(){
		
		System.out.println("The house is registering with the dept of buildings");
	}
	
	@Override
	public String toString() {
		return "\nType: House\n"
				+  getAddress() +"\n"+
				"Head of Household: " + headOfHousehold;
	}
	
}
