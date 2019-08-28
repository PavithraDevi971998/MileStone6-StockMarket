package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPODetails;

public interface IPODetailsService {
	public void insertIpoDetails(IPODetails ipoDetails);
	public List<IPODetails> getIPODetailsList() throws SQLException;
	public IPODetails getId(int id);
	public void updateipodetail(@Valid IPODetails ipoDetails);
	public void getdeleteipoCode(int id);

}
