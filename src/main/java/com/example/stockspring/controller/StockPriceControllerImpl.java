package com.example.stockspring.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.stockspring.model.StockExchange;
import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.StockPriceService;

@Controller
public class StockPriceControllerImpl {
@Autowired
StockPriceService stockPriceService;
@RequestMapping( value = "/addstockPrice", method = RequestMethod.GET)
public String getEmployeeForm(ModelMap model) {
	System.out.println("add employee");
	StockPrice e=new StockPrice();
	model.addAttribute("sp1", e);
	return "stockPrice";
}
@RequestMapping(value = "/addstockPrice", method = RequestMethod.POST)
public String formHandler(@ModelAttribute("sp1") @Valid StockPrice stockPrice, 
		BindingResult result, Model model) throws SQLException {
	System.out.println(stockPrice);
	if(result.hasErrors()){
		
		return "stockPrice";
	}
	stockPriceService.insertStockPrice(stockPrice);
	return "stockPrice";
	}
}
