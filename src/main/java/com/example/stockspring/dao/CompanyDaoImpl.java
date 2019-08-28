package com.example.stockspring.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

/*public class CompanyDaoImpl implements CompanyDao{

	public void insertCompany(Company company) throws SQLException  {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		
			PreparedStatement ps=con.prepareStatement("insert into company (company_name,ceo,company_code,turnOver,briefWriteUp,boardOfDirectors,stockCode) values(?,?,?,?,?,?,?)");
		    ps.setString(1, company.getcompany_name());
		    ps.setString(2,company.getCeo());
		    
		    ps.setInt(3,company.getCompany_code());
		    ps.setDouble(4, company.getTurnOver());
		    ps.setString(5, company.getBriefWriteup());
		    ps.setString(6,company.getBoardOfDirectors());
		    ps.setString(7, company.getStockCode());
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
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 company.setCompany_code(rs.getInt("company_code"));
			 company.setcompany_name(rs.getString("company_name"));
			company.setTurnOver(rs.getInt("turnOver"));
			company.setCeo(rs.getString("ceo"));
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			company.setBriefWriteup(rs.getString("briefWriteup"));
			company.setStockCode(rs.getString("stockCode"));
			companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
*/