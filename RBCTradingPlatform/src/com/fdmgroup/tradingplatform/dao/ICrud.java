package com.fdmgroup.tradingplatform.dao;

public interface ICrud <E,T,I> {

	T create(E e);
	
	E read(I i);
	
	T update(E e);
	
	T delete(I i);
	
	
}
