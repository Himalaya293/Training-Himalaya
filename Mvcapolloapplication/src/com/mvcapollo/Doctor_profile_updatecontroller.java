package com.mvcapollo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Doctor_profile_updatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dregistrationbean lb;
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Long mobile=Long.parseLong(phone);
		String Specialiazation=request.getParameter("specialiazation");
		int id=Integer.parseInt(request.getParameter("id"));

		Doctor_profile_updatebean dp=new Doctor_profile_updatebean();
		
		dp.setName("name");
		dp.setEmail("email");
		dp.setPhone("phone");
		dp.setSpecialiazation("Specialiazation");
		dp.setId(id);
		
		HttpSession hs=request.getSession();
		
		try {
			 lb=dp.dpuvalidate(name,email,phone,Specialiazation,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{

			hs.setAttribute("bean",lb);
	        hs.setAttribute("id", lb.getId());
		    hs.setAttribute("email",email);
			response.sendRedirect("doctor_profile.jsp?msg=Updated");
		}else {
			response.sendRedirect("./doctor_login.html?msg=login failed");
		}
		
		
	}

}
