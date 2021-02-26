package com.mvcapollo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Pregistrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String bloodgroup=request.getParameter("bloodgroup");
		int age=Integer.parseInt(request.getParameter("age"));
		String prescription=request.getParameter("prescription");

		
		Pregistrationbean eb=new Pregistrationbean();
		
		eb.setName("name");
		eb.setEmail("email");
		eb.setPassword("password");
		eb.setBloodgroup("bloodgroup");
		eb.setAge(age);
		eb.setPrescription("prescription");
		
		
		HttpSession hs=request.getSession();
		hs.setAttribute("bean",eb);
		PrintWriter pw=response.getWriter();
		PreparedStatement status=null;
		try {
			status=eb.pregistrationvalidate(name,email,password,bloodgroup,age,prescription);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html><body bgcolor='green'><center><h1>");
		if(status!=null)
		{
			pw.println("Patient Registered successfully");
		}else {
			pw.println("Patient Registration Failed");
		}
		pw.println("</h1></center></body></html>");
		
		
	}

}
