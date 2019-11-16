package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.utility.ConnectionManager;

/**
 * @author Tinu
 * @impNote perform user registeration
 * Date 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @impSec ->action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("1");
		response.setContentType("text/html");
		String name=request.getParameter("nameTxt");
		String email=request.getParameter("emailTxt");
		String phno=request.getParameter("phTxt");
		String uname=request.getParameter("unameTxt");
		String pass=request.getParameter("passTxt");
		
		//Encapsulation
		
		RegisterBO regbo=new RegisterBO();
		regbo.setName(name);
		regbo.setEmail(email);
		regbo.setPhno(phno);
		regbo.setUname(uname);
		regbo.setPass(pass);
		ConnectionManager con=new ConnectionManager();
		try {
			
			RegisterDAO.Save(con.getConnection(),regbo);//getConnection metod is userdefined not built in
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
