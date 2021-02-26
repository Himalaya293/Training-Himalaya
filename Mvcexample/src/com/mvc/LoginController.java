package com.mvc;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Registrationbean rb=null;
		

		HttpSession hs=request.getSession();
		
		try {
			  rb=new Loginbean().loginvalidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rb!=null)
		{
			hs.setAttribute("bean",rb);
			hs.setAttribute("email",email);
			hs.setAttribute("password",password);
			hs.setAttribute("manager",rb.getManager());
			hs.setAttribute("id",rb.getId());
			hs.setAttribute("name",rb.getName());
			response.sendRedirect("./manager_home.html");
		}else {
			response.sendRedirect("./manager_login.html");
		}
	}

}
