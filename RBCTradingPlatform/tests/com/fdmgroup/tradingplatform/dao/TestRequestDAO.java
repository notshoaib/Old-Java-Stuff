package com.fdmgroup.tradingplatform.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.tradingplatform.enums.RequestBuySellType;
import com.fdmgroup.tradingplatform.enums.RequestStatus;
import com.fdmgroup.tradingplatform.enums.TimeInForce;
import com.fdmgroup.tradingplatform.pojo.Request;

public class TestRequestDAO {

	Request request,request2;
	ICrud<Request, Boolean, Integer> requestDAO;
	
	@Before
	public void setUp(){
		request = new Request();
		requestDAO = new RequestDAO();
		request.setLimit_price(5.0);
		request.setMinimum_shares(100);
		request.setRequestDate(new java.sql.Timestamp(new java.util.Date().getTime()));
		request.setRequestType(RequestBuySellType.BUY);
		request.setShareholder_id(10);
		request.setShares(599);
		request.setStatus(RequestStatus.ACTIVE);
		request.setStock_id(1);
		request.setStockExId(3);
		request.setTimeInForce(TimeInForce.DAY_ONLY);
		
		requestDAO.create(request);
		
		
		request2 = new Request();
		request2.setLimit_price(null);
		request2.setMinimum_shares(100);
		request2.setRequestDate(new java.sql.Timestamp(new java.util.Date().getTime()));
		request2.setRequestType(RequestBuySellType.SELL);
		request2.setShareholder_id(10);
		request2.setShares(599);
		request2.setStatus(RequestStatus.ACTIVE);
		request2.setStock_id(1);
		request2.setStockExId(3);
		request2.setTimeInForce(TimeInForce.DAY_ONLY);
		
		requestDAO.create(request2);
	}

	@Test
	public void testCreatingRequest() {		
//		Account account2= new Account("dummy2","password",10);
//		assertTrue(accountDAO.create(account2));
//		accountDAO.delete("dummy2");
	}
	
	@Test
	public void testUpdatingRequest(){
		request.setLimit_price(50.0);
		request.setRequest_id(31);
		requestDAO.update(request);
		
		Request readRequest=requestDAO.read(request.getRequest_id());
		assertTrue(readRequest.getLimit_price()==50.0);
		
	}
	
	

}

