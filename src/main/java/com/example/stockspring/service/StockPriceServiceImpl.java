package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;
@Service
public class StockPriceServiceImpl implements StockPriceService {
	@Autowired
	StockPriceDao stockPriceDao;
	public void insertStockPrice(StockPrice stockPrice) {
		stockPriceDao.save(stockPrice);

	}

	public List<StockPrice> getStockPriceList() throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

}
