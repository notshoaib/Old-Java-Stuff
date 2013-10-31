package com.fdmgroup.rammem;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;

public interface DatabaseInterface<E> {

 	
	public void create(E e) throws NoLoadedDataException;

	public E retrieve(int key);

	public void update(int key, E e) throws NoSuchRecordException;

	public void delete(int key);

}
