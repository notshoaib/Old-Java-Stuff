package com.fdmgroup.tradingplatform.dao;

import java.util.List;

public interface ICrud <E,T,I> {

	T create(E e);
	
	E read(I i);
	
	List<E> readAll(I i);
	
	T update(E e);
	
	T delete(I i);
	
	
}
