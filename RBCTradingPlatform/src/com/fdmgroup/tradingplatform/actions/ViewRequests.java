package com.fdmgroup.tradingplatform.actions;

import java.util.List;

import com.fdmgroup.tradingplatform.dao.RequestDAO;
import com.fdmgroup.tradingplatform.pojo.Request;

public class ViewRequests {
	private RequestDAO requestDAO;
	private int shareholderId;

	public ViewRequests(RequestDAO requestDAO, int shareholderId) {
		this.shareholderId = shareholderId;
		this.requestDAO = requestDAO;
	}

	public List<Request> viewRequest() {

		List<Request> requestList = requestDAO.readAll(shareholderId);
		return requestList;

	}

}
