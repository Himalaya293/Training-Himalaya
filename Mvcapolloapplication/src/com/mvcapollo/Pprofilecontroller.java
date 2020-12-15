package com.mvcapollo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvcapollo.Pregistrationbean;

public class Pprofilecontroller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String bloodgroup=request.getParameter("bloodgroup");
		int age=Integer.parseInt(request.getParameter("age"));
		String prescription=request.getParameter("prescription");
		int id=Integer.parseInt(request.getParameter("id"));
		
		HttpSession hs=request.getSession();
		
		Pregistrationbean eb=null;

		eb.setName(name);
		eb.setEmail(email);
		eb.setPassword(password);
		eb.setBloodgroup(bloodgroup);
		eb.setAge(age);
		eb.setPrescription(prescription);
        eb.setId(id);
	try {
			eb=new Pprofilebean().pprofilevalidate(name,email,password,bloodgroup,age,prescription,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eb!=null)
		{
			hs.setAttribute("bean", eb);
			response.sendRedirect("./patient_profile.jsp?msg=updated successfully");
		}else {
			response.sendRedirect("./update_patient_profile.jsp?msg=updated failed");
		}
	}

}
