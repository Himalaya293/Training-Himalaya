package com.motivity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Adminlogincontroller extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String emailid=request.getParameter("emailid");
	    String password=request.getParameter("password");
	    
	    Admin al=Adminloginbean.adlogin(emailid, password);
	    HttpSession hs=request.getSession();
	    if(al!=null) {
	    	
	    	hs.setAttribute("aid", al.getAid());
	    	System.out.println(al.getAid());
	    	response.sendRedirect("./admin_home.html");
	    	
	    }
	    else
	    	response.sendRedirect("./admin_login.html?msg=login failed");
	}

}
