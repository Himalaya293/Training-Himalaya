package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String exp=request.getParameter("exp");
		int age=Integer.parseInt(request.getParameter("age"));
		String salary=request.getParameter("salary");
		String manager=request.getParameter("manager");
		
		Registrationbean lb=new Registrationbean();
		
		lb.setId(id);
		lb.setName("name");
		lb.setEmail("email");
		lb.setPassword("password");
		lb.setExp("exp");
		lb.setAge(age);
		lb.setSalary("salary");
		lb.setManager("manager");
		
		HttpSession hs=request.getSession();
		
		PrintWriter pw=response.getWriter();
		PreparedStatement status=null;
		try {
			status=lb.registrationvalidate(id,name,email,password,exp,age,salary,manager);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html><body bgcolor='green'><center><h1>");
		if(status!=null)
		{
			hs.setAttribute("bean",lb);
			pw.println("Manager Registered successfully");
		}else {
			pw.println("Manager Registered Failed");
		}
		pw.println("</h1></center></body></html>");
		
		
	}

}
