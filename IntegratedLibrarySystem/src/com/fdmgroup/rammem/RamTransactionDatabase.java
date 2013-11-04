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
		if (value!=null) {
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
	
	public Transaction retrieve(Patron p) {
		
		for(int i=0;i<transList.size();i++){
			if(transList.get(i).iscurrentLoan()&&transList.get(i).getPatron()==p){
				return transList.get(i);
			}
		}
		return null;
	}
	
	public Transaction transHistory(Patron p) {
		
		for(int i=0;i<transList.size();i++){
			if(transList.get(i).getPatron()==p){
				return transList.get(i);
			}
		}
		return null;
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
