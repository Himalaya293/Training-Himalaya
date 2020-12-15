package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Apply_leaveapplicationcontroller extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String reason=request.getParameter("reason");
		String doa=request.getParameter("doa");
		String doj=request.getParameter("doj");
		String department=request.getParameter("department");
		HttpSession hs=request.getSession();
		int id=(Integer)hs.getAttribute("id");
      
		
		boolean status=false;
		try {
			status=new Apply_leaveapplicationbean().leavevalidate(name,email,reason,doa,doj,department,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			response.sendRedirect("leaveapplication.jsp?msg=applied successfully");
		}else {
			response.sendRedirect("leaveapplication.jsp?msg=applied failed");
		}
		
	}

	
	
}
