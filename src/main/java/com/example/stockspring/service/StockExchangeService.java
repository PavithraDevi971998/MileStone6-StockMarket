package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.StockExchange;

public interface StockExchangeService {
public void insert(StockExchange stockExchange);
public List<StockExchange> getCompanyList() throws SQLException;
public StockExchange getStockexchangeid(int stockexchangeid);

public void updatestockExchange(@Valid StockExchange stockExchange);
public void getdeleteid(int stockexchangeid);
}
