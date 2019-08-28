package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	List<Company> findBysectorid(@Param("sectorid") int sectorid);
	@Query("select c from Company c where c.companyName like %:name%")
	List<Company> findBycompanyName(@Param("name")  String name);
	@Query("select c.companyCode from Company c where c.sectorid=:sectorid")
    int[] findSectorList(@Param("sectorid")int sectorid);
	List<Company>  findAll();
}