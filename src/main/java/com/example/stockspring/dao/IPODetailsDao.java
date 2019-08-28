package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.IPODetails;
import com.example.stockspring.model.StockPrice;

public interface IPODetailsDao extends JpaRepository<IPODetails, Integer> {

	List<IPODetails> findBycompanyCode(int companyCode);
}
