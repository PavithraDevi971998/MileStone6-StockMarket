package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="stockexchange")
public class StockExchange{
	@Id
	@Column(name="stockexchange_id")
	private int stockexchangeid;
	@Column(name="stockexchange_name")
	@NotEmpty(message="Enter the stockexchange name")
	private String stockexchangename;
	@Column(name="brief")
	@NotEmpty(message="Enter the brief")
	private String brief;
	@Column(name="address")
	@NotEmpty(message="Enter the address")
	private String address;
	@Column(name="remarks")
	@NotEmpty(message="Enter the remarks")
	private String remarks;
	public int getStockexchangeid() {
		return stockexchangeid;
	}
	public void setStockexchangeid(int stockexchangeid) {
		this.stockexchangeid = stockexchangeid;
	}
	public String getStockexchangename() {
		return stockexchangename;
	}
	public void setStockexchangename(String stockexchangename) {
		this.stockexchangename = stockexchangename;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}