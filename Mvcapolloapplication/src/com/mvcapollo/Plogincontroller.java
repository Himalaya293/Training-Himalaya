package com.mvcapollo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Plogincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Pregistrationbean eb=null;
		
		HttpSession hs=request.getSession();
	
		try {
			eb=new Ploginbean().ploginvalidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eb!=null)
		{
			hs.setAttribute("bean",eb);
	        hs.setAttribute("id", eb.getId());
		    hs.setAttribute("email",email);
		    hs.setAttribute("password",password);
		    hs.setAttribute("prescription",eb.getPrescription());
			response.sendRedirect("./patient_home.html?msg=login successfull");
		}else {
			response.sendRedirect("./patient_login.html?msg=login failed");
		}
	}

}
