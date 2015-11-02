package com.fdm.buildings;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Building {

	@Autowired
	private Address address;
	
	public Building() {
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	
}
