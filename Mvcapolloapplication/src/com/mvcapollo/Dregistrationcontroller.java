package com.mvcapollo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvcapollo.Dregistrationbean;

public class Dregistrationcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Long mobile=Long.parseLong(phone);
		String Specialiazation=request.getParameter("Specialiazation");

		
		Dregistrationbean lb=new Dregistrationbean();
		
		
		lb.setName("name");
		lb.setPassword("password");
		lb.setEmail("email");
		lb.setPhone("phone");
		lb.setSpecialiazation("Specialiazation");
		
		
		HttpSession hs=request.getSession();
		hs.setAttribute("bean",lb);
		PrintWriter pw=response.getWriter();
		PreparedStatement status=null;
		try {
			status=lb.registrationvalidate(name,password,email,phone,Specialiazation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html><body bgcolor='green'><center><h1>");
		if(status!=null)
		{

			hs.setAttribute("bean",lb);
	        hs.setAttribute("id", lb.getId());
		    hs.setAttribute("email",email);
			pw.println("Doctor Registered successfully");
		}else {
			pw.println("Doctor Registration Failed");
		}
		pw.println("</h1></center></body></html>");
		
		
	}

}
