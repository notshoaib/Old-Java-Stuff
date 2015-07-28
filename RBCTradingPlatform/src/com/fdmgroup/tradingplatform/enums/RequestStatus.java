package com.fdmgroup.tradingplatform.enums;

public enum RequestStatus {
	
	ACTIVE("ACTIVE"), PARTIAL_FILL("PARTIAL FILL"),
	COMPLETED("COMPLETED"), CANCELED("CANCELED");

	private String type;

	private RequestStatus(String type) {
		this.type = type;
	}

	public String getStringValue() {
		return this.type;
	}
}
