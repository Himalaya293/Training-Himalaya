package com.mvcapollo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dlogincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Dregistrationbean lb=null;
		
		HttpSession hs=request.getSession();
	
		try {
			lb=new Dloginbean().loginvalidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{
			hs.setAttribute("bean",lb);
	        hs.setAttribute("id", lb.getId());
		    hs.setAttribute("email",email);
		    hs.setAttribute("password",password);
		    hs.setAttribute("name",lb.getName());
		    hs.setAttribute("specialiazation",lb.getSpecialiazation());
			response.sendRedirect("./doctor_home.html?msg=login successfull");
		}else {
			response.sendRedirect("./doctor_login.html?msg=login failed");
		}
	}
}
