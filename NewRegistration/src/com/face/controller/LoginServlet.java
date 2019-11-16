package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.utility.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=request.getParameter("unameTxt");
		String pass=request.getParameter("passTxt");
		System.out.println("servlet parameter uname"+uname);
		LoginBO lbo=new LoginBO();
		lbo.setUname(uname);
		lbo.setPassword(pass);
		
		ConnectionManager con=new ConnectionManager();
		try {
			boolean status=LoginDAO.selectFunction(con.getConnection(),lbo);
			if(status==true) {
			
				RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.jsp");
				if(dispatcher!=null)
				{
					
					dispatcher.forward(request, response);
				}
			//response.sendRedirect(request.getContextPath()+"/welcome.jsp");
			
			}
			else {
				
				System.out.println("please check error occured");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
