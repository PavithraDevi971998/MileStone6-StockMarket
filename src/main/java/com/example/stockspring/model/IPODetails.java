package com.example.stockspring.model;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="ipo_planned")
public class IPODetails {
	
	@Id
	@Column(name="id")
private int id;
@Column(name="company_code")	
private int companyCode;
@Column(name="stock_exchange")
private int stockexchange;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="price")
private BigDecimal price;
@Column(name="total")
private int total;
@Column(name="date_time")
@NotEmpty(message="Enter the date time")
private String datetime;
@Column(name="remarks")
@NotEmpty(message="Enter the remarks")
private String remarks;
public int getCompanyCode() {
	return companyCode;
}
public void setCompanyCode(int companyCode) {
	this.companyCode = companyCode;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getStockexchange() {
	return stockexchange;
}
public void setStockexchange(int stockexchange) {
	this.stockexchange = stockexchange;
}
public  String getDatetime() {
	return datetime;
}
public void setDatetime( String datetime) {
	this.datetime = datetime;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}


}
