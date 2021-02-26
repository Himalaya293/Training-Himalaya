package com.mvcapollo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Update_doctor_profilecontroller extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private Dregistrationbean lb;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Long mobile=Long.parseLong(phone);
		String Specialiazation=request.getParameter("Specialiazation");
		int id=Integer.parseInt(request.getParameter("id"));

		
		
		
		lb.setName("name");
		lb.setEmail("email");
		lb.setPhone("phone");
		lb.setSpecialiazation("Specialiazation");
		lb.setId(id);
		
		HttpSession hs=request.getSession();
		//hs.setAttribute("bean",lb);
		try {
			 lb=new Update_doctor_pofilebean().udpvalidate(name,email,phone,Specialiazation,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lb!=null)
		{

			hs.setAttribute("bean",lb);
	        hs.setAttribute("id", lb.getId());
		    hs.setAttribute("email",email);
			response.sendRedirect("doctor_profile_update.jsp?msg=Updated");
		}
		
		
	}


}
