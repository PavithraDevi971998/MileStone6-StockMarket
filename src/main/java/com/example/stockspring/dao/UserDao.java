package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;

public interface UserDao extends JpaRepository<User, Integer>
{

	public List<User> findByuserName(String name);
}
