package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.face.bo.LoginBO;

public class LoginDAO {

	public static boolean selectFunction(Connection connection, LoginBO lbo) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("dao");
		boolean status=false;
		Statement stmnt=connection.createStatement();
		String query="select * from registration";
		ResultSet res=stmnt.executeQuery(query);
		while(res.next()) {
			System.out.println("res.getString(\"username\")"+res.getString("username"));
			if(lbo.getUname().equals(res.getString("username")) && lbo.getPassword().equals(res.getString("password"))){
				System.out.println("lbo.getUname()"+lbo.getUname());
				System.out.println("res.getString(\"username\")"+res.getString("username"));
				status=true;
			}
			
			else {
				
				System.out.println("login failed");
			}
		}
		System.out.println(status);
		return status;
		
	}

	public static void display(Connection connection, LoginBO lbo) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement stmnt=connection.createStatement();
		String query="select * from registration";
		List<String> regList=new ArrayList<String>();
		//LoginBO lbo=new Lo
		ResultSet res=stmnt.executeQuery(query);
		while(res.next()) {
			//regList.add(new LoginBO(res.getString("name"),res.getString("email"),res.getString("phno"),res.getString("username"),res.getString("password")));
	
			
			lbo.setName(res.getString("name"));
	lbo.setEmail(res.getString("email"));
	lbo.setPhno(res.getString("phno"));
	lbo.setUname(res.getString("username"));
	lbo.setPassword(res.getString("password"));
		
		System.out.println("phone no="+res.getString("phno"));
		}
	//List<String> list=new ArrayList
	}
	

}
