package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.User;
/*@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void insertUser(User user) throws SQLException {
		// TODO Auto-generated method stub
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		
			PreparedStatement ps=con.prepareStatement("insert into user (id,username,email,password,mobilenumber) values(?,?,?,?,?)");
		    ps.setInt(1,user.getId());
		    ps.setString(2,user.getUserName());
		    ps.setString(3, user.getEmail());
		   ps.setString(4, user.getPassword());
		   ps.setInt(5, user.getMobileNumber());
		    int res=ps.executeUpdate();
		    System.out.println(res);
		    if(res>0)
		    {
		    	System.out.println("inserted");
		    }
		    else
		    {
		    	System.out.println("not inserted");
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}*/
