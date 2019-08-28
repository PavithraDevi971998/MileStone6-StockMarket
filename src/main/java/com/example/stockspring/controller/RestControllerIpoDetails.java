package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.IPODetailsDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.IPODetails;
import com.example.stockspring.model.StockPrice;

@RestController
public class RestControllerIpoDetails {
	@Autowired
	IPODetailsDao ipoDetailsDao;
	@GetMapping("/ipodetails")
	List<IPODetails> getstockprice()
	{
		return ipoDetailsDao.findBycompanyCode(1);
		
	}
}
