package com.fdmgroup.rammem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fdmgroup.DTO.BookDTO;
import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.Logging;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;

public class RamMediaDatabase implements DatabaseInterface<Book> {
	int key;
	Book value;
	boolean loaded = false;

	public static HashMap<Integer, Book> userMap = new HashMap<Integer, Book>();

	public RamMediaDatabase() {

	}

	public RamMediaDatabase(HashMap<Integer, Book> map) {
		this.userMap = map;
	}

	@Override
	public void create(Book b) throws NoLoadedDataException {
		if (loaded) {
			userMap.put(key, value);
		} else {
			Logging.log.error("Data has not been loaded for creation");
			throw new NoLoadedDataException(
					"Data has not been loaded for creation");

		}
	}

	@Override
	public Book retrieve(int x) {
		return userMap.get(key);

	}

	@Override
	public void update(int key, Book b) throws NoSuchRecordException {
		if (userMap.get(key) != null) {
			userMap.put(key, b);
		} else {
			throw new NoSuchRecordException("Data specified does not exist");
		}
	}

	@Override
	public void delete(int key) {
		userMap.remove(key);

	}

	static public HashMap<Integer, Book> displayAll() {
		return userMap;
	}

}
