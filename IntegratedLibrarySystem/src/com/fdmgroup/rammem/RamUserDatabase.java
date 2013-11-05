package com.fdmgroup.rammem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fdmgroup.IBS.Logging;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.users.User;

public class RamUserDatabase implements DatabaseInterface<User> {

	public static HashMap<Integer, User> userMap = new HashMap<Integer, User>();

	public RamUserDatabase() {

	}

	public RamUserDatabase(HashMap<Integer, User> map) {
		RamUserDatabase.userMap = map;
	}

	@Override
	public void create(User user) throws NoLoadedDataException {
		userMap.put(user.getUserID(), user);

	}

	@Override
	public User retrieve(int key) {
		return userMap.get(key);

	}

	@Override
	public void update(int key, User user) throws NoSuchRecordException {
		if (userMap.get(key) != null) {
			userMap.put(key, user);
		} else {
			Logging.log.error("Data has not been loaded for creation");
			throw new NoSuchRecordException("Data specified does not exist");
		}

	}

	@Override
	public void delete(int userID) {
		// TODO Auto-generated method stub
		userMap.remove(userID);

	}



}
