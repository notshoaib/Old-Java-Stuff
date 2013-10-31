package com.fdmgroup.IBS;

public class NoSuchRecordException extends NoLoadedDataException {

	/**
	 * 
	 */

	String message;

	private static final long serialVersionUID = 1L;

	public NoSuchRecordException(String message) {
		super(message);
	}

}
