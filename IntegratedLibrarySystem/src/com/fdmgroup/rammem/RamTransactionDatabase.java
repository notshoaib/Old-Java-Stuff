package com.fdmgroup.rammem;

import java.util.ArrayList;
import java.util.HashMap;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.users.Patron;

public class RamTransactionDatabase implements DatabaseInterface<Transaction> {

	ArrayList<Transaction> transList = new ArrayList<Transaction>();

	public RamTransactionDatabase() {

	}

	public RamTransactionDatabase(ArrayList<Transaction> transList) {
		this.transList = transList;
	}

	@Override
	public void create(Transaction value) throws NoLoadedDataException {
		if (loaded) {
			transList.add(value);
		} else {

			throw new NoLoadedDataException(
					"Data has not been loaded for creation");

		}
	}

	@Override
	public Transaction retrieve(int key) {
		// TODO Auto-generated method stub
		return transList.get(key);
	}
	
	public void retrieve(Patron p) {
		
		for(int i=0;i<transList.size();i++){
			if(transList.get(i).iscurrentLoan()&&transList.get(i).getPatron()==p){
				System.out.println("Transaction #: " +transList.get(i).getTransID()+ "is open");
			}
		}
	}
	
	public void transHistory(Patron p) {
		
		for(int i=0;i<transList.size();i++){
			if(transList.get(i).getPatron()==p){
				System.out.println("Transaction #: " +transList.get(i).getTransID()+ "is open");
			}
		}
	}

	@Override
	public void update(int key, Transaction e) throws NoSuchRecordException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int key) {
		// TODO Auto-generated method stub

	}
	

}
