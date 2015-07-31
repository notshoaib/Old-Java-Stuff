package com.fdmgroup.tradingplatform.pojo;

import java.sql.Date;
import java.sql.Timestamp;

public class Trade {
	

	private int stockExId;
	private int stockId;
	private Timestamp transactionTime;
	private int shares;
	private double sharePrice;
	private double priceTotal;
	private int buyerId;
	private int sellerId;
	private int buyBrokerId;
	private int sellBrokerId;
	private int buyRequestId;
	private int sellRequestId;

	public int getStockExId() {
		return stockExId;
	}

	public void setStockExId(int stockExId) {
		this.stockExId = stockExId;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getBuyBrokerId() {
		return buyBrokerId;
	}

	public void setBuyBrokerId(int buyBrokerId) {
		this.buyBrokerId = buyBrokerId;
	}

	public int getSellBrokerId() {
		return sellBrokerId;
	}

	public void setSellBrokerId(int sellBrokerId) {
		this.sellBrokerId = sellBrokerId;
	}

	public int getBuyRequestId() {
		return buyRequestId;
	}

	public void setBuyRequestId(int buyRequestId) {
		this.buyRequestId = buyRequestId;
	}

	public int getSellRequestId() {
		return sellRequestId;
	}

	public void setSellRequestId(int sellRequestId) {
		this.sellRequestId = sellRequestId;
	}
	
	
	

}
