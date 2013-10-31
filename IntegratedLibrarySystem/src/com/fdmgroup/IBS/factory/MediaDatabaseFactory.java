package com.fdmgroup.IBS.factory;

import java.util.HashMap;

import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamMediaDatabase;

public class MediaDatabaseFactory {
	
	public static DatabaseInterface<Book> getDatabase(String type)
	{
		if (type.equals("ram"))
			return new RamMediaDatabase(new HashMap<Integer, Book>());
		//else if (type.equals("DB"))
		//	return new DBUserDatabase(new HashMap<Integer, User>());
		//else if (type.equals("SQL"))
		//	return new DBUserDatabase(new HashMap<Integer, User>());
		return null;
	}
	

}

