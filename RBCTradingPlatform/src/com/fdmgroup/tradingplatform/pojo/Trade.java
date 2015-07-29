package com.fdmgroup.tradingplatform.pojo;

import java.sql.Date;

public class Trade {
	

	private int stock_ex_id;
	private int stock_id;
	private Date transactionTime;
	private int shares;
	private double share_price;
	private double price_total;
	private int buyer_id;
	private int seller_id;
	
	public int getStock_ex_id() {
		return stock_ex_id;
	}
	public void setStock_ex_id(int stock_ex_id) {
		this.stock_ex_id = stock_ex_id;
	}
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public Date getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public double getShare_price() {
		return share_price;
	}
	public void setShare_price(double share_price) {
		this.share_price = share_price;
	}
	public double getPrice_total() {
		return price_total;
	}
	public void setPrice_total(double price_total) {
		this.price_total = price_total;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getBuy_broker_id() {
		return buy_broker_id;
	}
	public void setBuy_broker_id(int buy_broker_id) {
		this.buy_broker_id = buy_broker_id;
	}
	public int getSell_broker_id() {
		return sell_broker_id;
	}
	public void setSell_broker_id(int sell_broker_id) {
		this.sell_broker_id = sell_broker_id;
	}
	public int getBuy_request_id() {
		return buy_request_id;
	}
	public void setBuy_request_id(int buy_request_id) {
		this.buy_request_id = buy_request_id;
	}
	public int getSell_request_id() {
		return sell_request_id;
	}
	public void setSell_request_id(int sell_request_id) {
		this.sell_request_id = sell_request_id;
	}
	private int buy_broker_id;
	private int sell_broker_id;
	private int buy_request_id;
	private int sell_request_id;
	
	
	

}
