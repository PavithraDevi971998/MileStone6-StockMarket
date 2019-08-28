package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;

import com.example.stockspring.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	public void insertCompany(Company company) throws SQLException {
	companyDao.save(company);
		
		
	}

	

	public List<Company> getCompanyList() throws SQLException {
		return companyDao.findAll();
	}

	@Override
	public Company getcompanyCode(int companyCode) {
		// TODO Auto-generated method stub
		return companyDao.getOne(companyCode);
	}



	@Override
	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		companyDao.save(company);
		
	}



	@Override
	public void getdeleteCode(int companyCode) {
		// TODO Auto-generated method stub
		 companyDao.deleteById(companyCode);
	}



	@Override
	public List<Company> findBycompanyName(String companyName) {
		// TODO Auto-generated method stub
		return companyDao.findBycompanyName(companyName);
	}




}
