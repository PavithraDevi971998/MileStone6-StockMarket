package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.StockPrice;

public interface StockPriceService {
public void insertStockPrice(StockPrice stockPrice);
public List<StockPrice> getStockPriceList() throws SQLException;
}
