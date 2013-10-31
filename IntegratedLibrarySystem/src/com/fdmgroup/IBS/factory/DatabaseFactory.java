package com.fdmgroup.IBS.factory;

public abstract class DatabaseFactory<E> {
	
	
	protected abstract E makeUserRamDB();
	
	protected abstract E makeTransRamDB();

	protected abstract E makeMediaRamDB();
}
