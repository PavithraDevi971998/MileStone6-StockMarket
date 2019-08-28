package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.User;
import com.example.stockspring.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
private UserDao userDao;
	
	public void insertUser(User user) throws SQLException {
	userDao.save(user);
	

	}

	
	public List<User> findByuserName(String name) {
		// TODO Auto-generated method stub
		return userDao.findByuserName(name);
	}

}
