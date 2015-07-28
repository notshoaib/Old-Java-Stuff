package com.fdmgroup.tradingplatform.enums;

public enum RequestBuySellType {
	BUY("BUY"), SELL("SELL");

	private String type;

	private RequestBuySellType(String type) {
		this.type = type;
	}

	public String getStringValue() {
		return this.type;
	}
}
