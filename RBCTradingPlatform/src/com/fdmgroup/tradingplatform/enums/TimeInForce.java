package com.fdmgroup.tradingplatform.enums;

public enum TimeInForce {
	DAY_ONLY("DAY ONLY"),
	GOOD_UNTIL_CANCELLED("GOOD UNTIL CANCELLED"),
	IMMEDIATE_OR_CANCEL("IMMEDIATE OR CANCEL");
	
	private String type;

	private TimeInForce(String type) {
		this.type = type;
	}

	public String getStringValue() {
		return this.type;
	}

	public static TimeInForce getTimeInForce(String string) {
		if(string.equals("DAY ONLY")){
			return DAY_ONLY;
		}
		else if(string.equals("GOOD UNTIL CANCELLED")){
			return GOOD_UNTIL_CANCELLED;
		}
		else if (string.equals("IMMEDIATE OR CANCEL")){
			return IMMEDIATE_OR_CANCEL;
		}
		return null;
		
	}
	
}
