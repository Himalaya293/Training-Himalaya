package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmpregisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    String gender=request.getParameter("gender");
	    String joiningdate=request.getParameter("joiningdate");
	    String department=request.getParameter("department");
	    String exp=request.getParameter("exp");
	    
		Eregistrationbean eb=new Eregistrationbean();
		
		eb.setName("name");
		eb.setEmail("email");
		eb.setPassword("password");
		eb.setGender("gender");
		eb.setJoiningdate("joiningdate");
		eb.setDepartment("department");
		eb.setExp("exp");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("bean",eb);
		PrintWriter pw=response.getWriter();
		boolean status=false;
		try {
			status=eb.registrationvalidate(name,email,password,gender,joiningdate,department,exp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html><body bgcolor='pink'><center><h1>");
		if(status)
		{
			pw.println("Employee Registered successfully");
		}else {
			pw.println("Employee Registered Failed");
		}
		pw.println("</h1></center></body></html>");
		
		
	}

}
