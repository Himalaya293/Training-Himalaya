package com.mvcapollo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Patient_profile_updatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String bloodgroup=request.getParameter("bloodgroup");
		int age=Integer.parseInt(request.getParameter("age"));
		String prescription=request.getParameter("prescription");
		int id=Integer.parseInt(request.getParameter("id"));
		
		Patient_profile_updatebean ppu=new Patient_profile_updatebean();
		Pregistrationbean eb=null;
		
		ppu.setName("name");
		ppu.setEmail("email");
		ppu.setBloodgroup("bloodgroup");
		ppu.setAge(age);
		ppu.setPrescription("prescription");
		ppu.setId(id);
		
		
		HttpSession hs=request.getSession();
		
		try {
			eb=ppu.ppuvalidate(name,email,bloodgroup,age,prescription,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eb!=null)
		{
			hs.setAttribute("bean",eb);
			response.sendRedirect("patient_profile.jsp?msg=Updated");
		}
		
		
	}

	

}
