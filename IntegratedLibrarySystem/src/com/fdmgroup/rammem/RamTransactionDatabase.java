package com.fdmgroup.rammem;

import java.util.ArrayList;
import java.util.HashMap;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.Transaction;

public class RamTransactionDatabase implements DatabaseInterface<Transaction> {

	
	ArrayList<Transaction> transList=new ArrayList<Transaction>();
	
	public RamTransactionDatabase(){
		
	}
	
	public RamTransactionDatabase(ArrayList<Transaction> transList){
		this.transList=transList;
	}

	@Override
	public void create(Transaction value) throws NoLoadedDataException {
		if(loaded){
			transList.add(value);
		}
		else{
	
			throw new NoLoadedDataException("Data has not been loaded for creation");
		
		}
	}

	@Override
	public Transaction retrieve() {
		return transList.get(value.transID);
		
	}

	@Override
	public void update(int x) throws NoSuchRecordException {
//		if(transList.get(key) != null){
//			transList.
//		}
//		else{
//			throw new NoSuchRecordException("Data specified does not exist");
//		}
			
	}





	@Override
	public Transaction retrieve(int key) {
		// TODO Auto-generated method stub
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
