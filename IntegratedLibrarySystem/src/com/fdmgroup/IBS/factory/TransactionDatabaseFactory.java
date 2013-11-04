package com.fdmgroup.IBS.factory;

import java.util.ArrayList;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamTransactionDatabase;
public class TransactionDatabaseFactory {



		public static DatabaseInterface<Transaction> getDatabase(String type) {
			if (type.equals("ram"))
				return new RamTransactionDatabase(new ArrayList<Transaction>());
//			 else if (type.equals("DB"))
//			 return new DBUserDatabase(new HashMap<Integer, User>());
//			 else if (type.equals("SQL"))
//			 return new DBUserDatabase(new HashMap<Integer, User>());
			return null;
		}

	}


