package com.fdmgroup.nycdeathdata.util;

import java.math.BigDecimal;

public class Year {

	String cause;
	BigDecimal count;

	public Year(String cause, BigDecimal count) {
		this.cause=cause;
		this.count=count;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	
}
