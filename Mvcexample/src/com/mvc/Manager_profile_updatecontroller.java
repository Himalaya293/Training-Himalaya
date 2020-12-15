package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Manager_profile_updatecontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String exp=request.getParameter("exp");
		int age=Integer.parseInt(request.getParameter("age"));
		String salary=request.getParameter("salary");
		String manager=request.getParameter("manager");
		int id=Integer.parseInt(request.getParameter("id"));
		
		Manager_profile_updatebean mpu=new Manager_profile_updatebean();
		Registrationbean lb=null;
		
		mpu.setName("name");
		mpu.setEmail("email");
		mpu.setExp("exp");
		mpu.setAge(age);
		mpu.setSalary("salary");
		mpu.setManager("manager");
		mpu.setId(id);
		
		
		HttpSession hs=request.getSession();
		
		try {
			lb=mpu.mpuvalidate(name,email,exp,age,salary,manager,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{
			hs.setAttribute("bean",lb);
			response.sendRedirect("manager_profile.jsp?msg=Updated");
		}
		
		
	}

}
