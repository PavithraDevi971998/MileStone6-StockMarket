package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;

public interface CompanyController {

  	   
	    
		public ModelAndView getCompanyList() throws Exception;

	
}
