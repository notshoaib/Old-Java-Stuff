package com.fdmgroup.nycdeathdata.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class YearSummaryC {

	
	private int year;
	@Id
	private String causeOfDeath;
	@Column
	private int count;
}
