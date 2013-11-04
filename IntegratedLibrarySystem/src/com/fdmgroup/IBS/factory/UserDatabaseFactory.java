package com.fdmgroup.IBS.factory;

import java.util.HashMap;

import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamUserDatabase;

public class UserDatabaseFactory {
	public static DatabaseInterface<User> getDatabase(String type) {
		if (type.equals("ram"))
			return new RamUserDatabase(new HashMap<Integer, User>());
//		 else if (type.equals("DB"))
//		 return new DBUserDatabase(new HashMap<Integer, User>());
//		 else if (type.equals("SQL"))
//		 return new DBUserDatabase(new HashMap<Integer, User>());
		return null;
	}

}
