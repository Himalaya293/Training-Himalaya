package com.mvcapollo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Apply_appointmentcontroller extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String patientname=request.getParameter("patientname");
		long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String bloodgroup=request.getParameter("bloodgroup");
		String specialiazation=request.getParameter("specialiazation");
		String doa=request.getParameter("doa");
		String toa=request.getParameter("toa");
      
		
		PreparedStatement status=null;
		try {
			status=new Apply_appointmentbean().appointmentvalidate(patientname,phone,email,gender,bloodgroup,specialiazation,doa,toa);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status!=null)
		{
			response.sendRedirect("appointment.jsp?mssg=applied_appointment");
		}
		
	}


}
