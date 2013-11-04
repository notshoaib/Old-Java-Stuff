package com.fdmgroup.IBS.command;

public interface Command<E> {
	
	public E execute() throws Exception;

}
