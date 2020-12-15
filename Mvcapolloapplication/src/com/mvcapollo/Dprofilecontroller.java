package com.mvcapollo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dprofilecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Long mobile=Long.parseLong(phone);
		String Specialiazation=request.getParameter("Specialiazation");

		
		Dregistrationbean lb=null;
		
		
		lb.setName("name");
		lb.setPassword("password");
		lb.setEmail("email");
		lb.setPhone("phone");
		lb.setSpecialiazation("Specialiazation");
		
		
		HttpSession hs=request.getSession();
		
		try {
			lb=new Dprofilebean().dprofilevalidate(name,password,email,phone,Specialiazation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{
			hs.setAttribute("bean", lb);
			response.sendRedirect("./doctor_profile.jsp?msg=updated successfully");
		}else {
			response.sendRedirect("./update_doctor_profile.jsp?msg=updated successfully");
		}
		
		
	}


}
