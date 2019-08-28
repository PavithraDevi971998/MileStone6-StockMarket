package com.example.stockspring.model;
import java.io.*;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
@Entity
@Table(name="stock_price")
public class StockPrice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_code")
	private int stockCode;
	//@ManyToOne(cascade=CascadeType.ALL)
	@Column(name="company_code")
private int companyCode;
	@Column(name="stockexchange_id")
private int stockExchangeId;
	@Column(name="stockexchange_name")
	private String StockExchange;
	@Column(name="current_price")
private double currentPrice;
	@Column(name="date")
private Date date;
	@Column(name="time")
private String time;
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

	
	

}
