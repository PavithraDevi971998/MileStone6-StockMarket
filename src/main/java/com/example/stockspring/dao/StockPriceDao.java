package com.example.stockspring.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.stockspring.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {

	
	List<StockPrice> findBycompanyCode(int code);
	@Query("select s from StockPrice s where s.companyCode=:companyCode and s.date between :date1 and :date2")
	List<StockPrice> findBydate(@Param("companyCode") int companyCode,@Param("date1")Date date1,@Param("date2")Date date2);
	/*@Query("select s.current_price from StockPrice s inner join Company c on c.company_code=s.company_code inner join Sector t on c.sectorid=:sectorid")
	public int findBysectorid(@Param("sectorid") int sectorid);*/

    @Query("select s.currentPrice from StockPrice s where s.companyCode=:companyCode and s.date between :date1 and :date2")
    public List<Double> findBycompanyCode(@Param(value="companyCode") int companyCode,@Param(value = "date1") Date date1, @Param(value = "date2") Date date2);
    

}

