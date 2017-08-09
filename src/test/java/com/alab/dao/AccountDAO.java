package com.alab.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	

	@Autowired
	private JdbcTemplate jt;
	public void getdata(){
		System.out.println("abc666*****************");
		try {
			System.out.println(jt.getDataSource().getConnection().getClass().getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}
