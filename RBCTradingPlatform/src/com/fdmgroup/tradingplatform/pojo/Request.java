package com.fdmgroup.tradingplatform.pojo;

import java.sql.Date;

import com.fdmgroup.tradingplatform.enums.RequestBuySellType;
import com.fdmgroup.tradingplatform.enums.RequestStatus;
import com.fdmgroup.tradingplatform.enums.TimeInForce;

public class Request {
	
	private int request_id;
	private int parent_request_id;
	private int share_filled;
	private int shareholder_id;
	private Date requestDate;
	private RequestBuySellType requestType;
	private RequestStatus status;
	private int stockExId;
	private int stock_id;
	private int shares;
	private int minimum_shares;
	private TimeInForce timeInForce;
	private Double limit_price;
	private Double stop_price;
	
	public Request(){
		
	}
	
	public Request(int request_id, int shareholder_id, Date requestDate,
			RequestBuySellType requestType, RequestStatus status,
			int stockExId, int stock_id, int shares, int minimum_shares,
			TimeInForce timeInForce, Double limit_price, Double stop_price) {
		super();
		this.request_id = request_id;
		this.shareholder_id = shareholder_id;
		this.requestDate = requestDate;
		this.requestType = requestType;
		this.status = status;
		this.stockExId = stockExId;
		this.stock_id = stock_id;
		this.shares = shares;
		this.minimum_shares = minimum_shares;
		this.timeInForce = timeInForce;
		this.limit_price = limit_price;
		this.stop_price = stop_price;
	}
	public int getStockExId() {
		return stockExId;
	}
	public void setStockExId(int stockExId) {
		this.stockExId = stockExId;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getParent_request_id() {
		return parent_request_id;
	}
	public void setParent_request_id(int parent_request_id) {
		this.parent_request_id = parent_request_id;
	}
	public int getShare_filled() {
		return share_filled;
	}
	public void setShare_filled(int share_filled) {
		this.share_filled = share_filled;
	}
	public int getShareholder_id() {
		return shareholder_id;
	}
	public void setShareholder_id(int shareholder_id) {
		this.shareholder_id = shareholder_id;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public RequestBuySellType getRequestType() {
		return requestType;
	}
	public void setRequestType(RequestBuySellType requestType) {
		this.requestType = requestType;
	}
	public RequestStatus getStatus() {
		return status;
	}
	public void setStatus(RequestStatus status) {
		this.status = status;
	}
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public int getMinimum_shares() {
		return minimum_shares;
	}
	public void setMinimum_shares(int minimum_shares) {
		this.minimum_shares = minimum_shares;
	}
	public TimeInForce getTimeInForce() {
		return timeInForce;
	}
	public void setTimeInForce(TimeInForce timeInForce) {
		this.timeInForce = timeInForce;
	}
	public Double getLimit_price() {
		return limit_price;
	}
	public void setLimit_price(Double limit_price) {
		this.limit_price = limit_price;
	}
	public Double getStop_price() {
		return stop_price;
	}
	public void setStop_price(Double stop_price) {
		this.stop_price = stop_price;
	}
	
	
}
