package com.example.stockspring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RestControllerCompany {
	@Autowired
	 CompanyDao companyDao;
	@GetMapping("/company/{sectorid}")
	public List<Company> sectorList(@PathVariable("sectorid") int sectorid)
	{
		return companyDao.findBysectorid(sectorid);
	}
	@GetMapping("/company")
	public List<Company> companyList() {
		return companyDao.findAll();
	}
	@GetMapping("/company/name/{name}")
	public List<Company> companyname(@PathVariable("name") String  name)
	{
		return companyDao.findBycompanyName(name);
	}
	

}
