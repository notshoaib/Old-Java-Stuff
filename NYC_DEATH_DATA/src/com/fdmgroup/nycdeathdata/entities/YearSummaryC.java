package com.fdmgroup.nycdeathdata.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class YearSummaryC implements Comparable {

	
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

	@Override
	public int compareTo(Object arg0) {
		if(arg0 instanceof YearSummaryC){
		return this.causeOfDeath.compareTo(((YearSummaryC)arg0).causeOfDeath);
		}
		return 0;
	}
}
