package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from Customer where Cus_UserName=? "
				+ " AND Cus_Password=?";
		List str=jdbc.query(cmd,new Object[] {user, pwd}, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
	
	public String showCustomerId(String user) {
		String cmd = "select CUS_ID cid from Customer where Cus_UserName=?";
		List str=jdbc.query(cmd,new Object[] {user}, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cid");
			}
			
		});
		return str.get(0).toString();
	}
}
