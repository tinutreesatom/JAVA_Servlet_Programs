package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.ws.Response;

import com.face.bo.RegisterBO;

public class RegisterDAO {

	public static void Save(Connection connection, RegisterBO regbo) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmnt=connection.createStatement();//
		String query="Insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPhno()+"','"+regbo.getUname()+"','"+regbo.getPass()+"')";
		int result=stmnt.executeUpdate(query);
		if(result==1) {
			System.out.println("Insertion successfull");
		}
		else
		{
			System.out.println("Insertion failed");
		}
	}

	
}
