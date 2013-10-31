package com.fdmgroup.IBS;

public class NoLoadedDataException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	 public NoLoadedDataException ()
     {
     }

 public NoLoadedDataException (String message)
     {
     super (message);
     }

 public NoLoadedDataException (Throwable cause)
     {
     super (cause);
     }

 public NoLoadedDataException (String message, Throwable cause)
     {
     super (message, cause);
     }


}
