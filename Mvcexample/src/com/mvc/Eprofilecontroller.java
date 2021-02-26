package com.mvc;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Eprofilecontroller extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String joiningdate=request.getParameter("joiningdate");
		String department=request.getParameter("department");
		String exp=request.getParameter("exp");
		
		HttpSession hs=request.getSession();
		
		Eregistrationbean eb=null;

		eb.setId(id);
		eb.setName(name);
		eb.setEmail(email);
		eb.setPassword(password);
		eb.setGender(gender);
		eb.setJoiningdate(joiningdate);
		eb.setDepartment(department);
		eb.setExp(exp);
	try {
			eb=new Empprofilebean().profilevalidate(id,name,email,password,gender,joiningdate,department,exp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eb!=null)
		{
			hs.setAttribute("bean", eb);
			response.sendRedirect("./emp_profile.jsp?msg=updated successfully");
		}else {
			response.sendRedirect("./update_emp_profile.jsp?msg=updated failed");
		}
	}

}
