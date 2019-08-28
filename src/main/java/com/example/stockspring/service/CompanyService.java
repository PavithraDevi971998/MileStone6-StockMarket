package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.Company;

public interface CompanyService {

	
	  public void insertCompany(Company company) throws SQLException;
	    
		public List<Company> getCompanyList() throws SQLException;
		public Company getcompanyCode(int companyCode);

		public void updateCompany( Company company);

		public void getdeleteCode(int companyCode);

		public List<Company>  findBycompanyName(String companyName);

	

}
