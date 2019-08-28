package com.example.stockspring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;

@RestController
public class RestControllerStockPrice {
@Autowired
StockPriceDao stockpriceDao;
@Autowired
CompanyDao companyDao;
@GetMapping("/stockprice")
List<StockPrice> getstockprice()
{
	return stockpriceDao.findBycompanyCode(1);
	
}
@GetMapping("/stockprice/{companyCode}/{date1}/{date2}")
List<StockPrice> getdate( @PathVariable("companyCode")int companyCode,@PathVariable("date1")Date date1,@PathVariable("date2") Date  date2)
{
	return stockpriceDao.findBydate(companyCode,date1,date2);
}
@GetMapping("/listofcompaniesinsector/{sectorid}/{date1}/{date2}")
Double companySectorList(@PathVariable("sectorid") int sectorid,@PathVariable("date1") Date date1,@PathVariable("date2") Date date2)
{
       Double sum=0.0;
       int companyCode[]= companyDao.findSectorList(sectorid);
       List<Double> stockPriceList=new ArrayList<>();
       for(int i=0;i<companyCode.length;i++)
       {
         
          stockpriceDao.findBycompanyCode(companyCode[i],date1,date2).forEach(stockPriceList::add);
       }
       
       for(Double price:stockPriceList)
       {
           sum=sum+price;
       }
       return sum; 
}
}
