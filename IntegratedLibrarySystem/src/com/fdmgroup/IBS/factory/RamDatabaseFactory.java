//package com.fdmgroup.IBS.factory;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import com.fdmgroup.IBS.DatabaseFactory;
//import com.fdmgroup.IBS.RamTransactionDatabase;
//import com.fdmgroup.IBS.Transaction;
//import com.fdmgroup.IBS.CatalogMedia.Book;
//import com.fdmgroup.IBS.users.User;
//import com.fdmgroup.rammem.RamMediaDatabase;
//import com.fdmgroup.rammem.RamUserDatabase;
//
//public class RamDatabaseFactory extends DatabaseFactory<Object>{
//	
//	
//	
//	@Override
//	public RamUserDatabase makeUserRamDB() {
//		HashMap<Integer, User> Hash=new HashMap<Integer, User>();
//		RamUserDatabase Ram=new RamUserDatabase(Hash);
//		return Ram;
//	}
//
//	@Override
//	public RamTransactionDatabase makeTransRamDB() {
//		ArrayList<Transaction> ArrayList=new ArrayList<Transaction>();
//		RamTransactionDatabase Ram=new RamTransactionDatabase(ArrayList);
//		return Ram;
//	}
//
//	@Override
//	public RamMediaDatabase makeMediaRamDB() {
//		HashMap<Integer, Book> Hash=new HashMap<Integer, Book>();
//		RamMediaDatabase Ram=new RamMediaDatabase(Hash);
//		return Ram;
//	}
//}
