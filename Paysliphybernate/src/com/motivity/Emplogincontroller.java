package com.motivity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Emplogincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    
	    Employee el=Employeeloginbean.elogin(email,password);
	    HttpSession hs=request.getSession();
	    if(el!=null) {
	    	
	    	//hs.setAttribute("aid", al.getAid());
	    	//System.out.println(al.getAid());
	    	response.sendRedirect("./emp_home.html");
	    	
	    }
	    else
	    	response.sendRedirect("./admin_login.html?msg=login failed");
	}
}
