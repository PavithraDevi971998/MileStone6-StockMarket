package com.example.stockspring.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="company")
public class Company {
@Id
@Column(name="company_code")
private int companyCode;
@Column(name="company_name")
@NotEmpty(message="Enter the user name")
private String companyName;
@Column(name="turnover")
private BigDecimal turnOver;
@Column(name="ceo")
@NotEmpty(message="Enter the ceo name")
private String ceo;
@Column(name="board_of_directors")
@NotEmpty(message="Enter the board of directors")
private String boardOfDirectors;
@Column(name="sectorid")
private int sectorid;
@Column(name="briefwriteup")
@NotEmpty(message="Enter the brief writeup")
private String briefWriteup;
	@Column(name="stock_code")
private String stockCode;
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public int getSectorid() {
		return sectorid;
	}
	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

}
