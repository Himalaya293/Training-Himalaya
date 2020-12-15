package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Accept_leaveapplicationcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs=request.getSession();
		//String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		String manager_name=(String)hs.getAttribute("name");
		boolean status=false;
		try {
			status=new Accept_leaveapplicationbean().acceptvalidate(manager_name,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status) 
		{
			response.sendRedirect("view_leaveapplication.jsp?msg=applied successfully");
		}
		
	}
	
	
}
