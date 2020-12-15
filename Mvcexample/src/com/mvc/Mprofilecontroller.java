package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mprofilecontroller extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String exp=request.getParameter("exp");
		int age=Integer.parseInt(request.getParameter("age"));
		String salary=request.getParameter("salary");
		String manager=request.getParameter("manager");
		
		HttpSession hs=request.getSession();
		
		Registrationbean lb=null;

		lb.setId(id);
		lb.setName(name);
		lb.setEmail(email);
		lb.setPassword(password);
		lb.setExp(exp);
		lb.setAge(age);
		lb.setSalary(salary);
		lb.setManager(manager);
		lb.setExp(exp);
	try {
			lb=new Mprofilebean().profilevalidate(id,name,email,password,exp,age,salary,manager);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{
			hs.setAttribute("bean", lb);
			response.sendRedirect("./manager_profile.jsp?msg=updated successfully");
		}else {
			response.sendRedirect("./update_manager_profile.jsp?msg=updated failed");
		}
	}

}


