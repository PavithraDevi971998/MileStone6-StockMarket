package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockExchangeDao;
import com.example.stockspring.model.StockExchange;
@Service
public class StockExchangeServiceImpl implements StockExchangeService {
	@Autowired
StockExchangeDao stockExchangeDao;
	public void insert(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		stockExchangeDao.save(stockExchange);

	}
	public List<StockExchange> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return stockExchangeDao.findAll();
	}
	@Override
	public StockExchange getStockexchangeid(int stockexchangeid) {
		// TODO Auto-generated method stub
		return stockExchangeDao.getOne(stockexchangeid);
	}

	
	@Override
	public void updatestockExchange(@Valid StockExchange stockExchange) {
		// TODO Auto-generated method stub
		stockExchangeDao.save(stockExchange);
	}
	@Override
	public void getdeleteid(int stockexchangeid) {
		// TODO Auto-generated method stub
		stockExchangeDao.deleteById(stockexchangeid);
		
	}

}
