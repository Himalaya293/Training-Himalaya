package com.mvc;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Emp_profile_updatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String joiningdate=request.getParameter("joiningdate");
		String department=request.getParameter("department");
		String exp=request.getParameter("exp");
		int id=Integer.parseInt(request.getParameter("id"));
		
		Emp_profile_updatebean epu=new Emp_profile_updatebean();
		Eregistrationbean eb=null;
		
		epu.setName("name");
		epu.setEmail("email");
		epu.setGender("gender");
		epu.setJoiningdate("joiningdate");
		epu.setDepartment("department");
		epu.setExp("exp");
		epu.setId(id);
		
		
		HttpSession hs=request.getSession();
		
		try {
			eb=epu.epuvalidate(name,email,gender,joiningdate,department,exp,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eb!=null)
		{
			hs.setAttribute("bean",eb);
			response.sendRedirect("emp_profile.jsp?msg=Updated");
		}
		
		
	}

}
