package com.fdmgroup.nycdeathdata.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class YearSummaryC {

	
	public YearSummaryC(int yearOf, String causeOfDeath2, int count2) {
		
	this.year=yearOf;
	this.causeOfDeath=causeOfDeath2;
	this.count=count2;
	
	}
	private int year;
	
	private String causeOfDeath;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCauseOfDeath() {
		return causeOfDeath;
	}

	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	private int count;
}
