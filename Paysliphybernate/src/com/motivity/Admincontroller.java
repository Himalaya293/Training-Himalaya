package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Admincontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid=Integer.parseInt(request.getParameter("aid"));
		String aname=request.getParameter("aname");
	    String emailid=request.getParameter("emailid");
	    String password=request.getParameter("password");
	    String phone=request.getParameter("phone");
	    String doj=request.getParameter("doj");
	    String dob=request.getParameter("dob");
	    String address=request.getParameter("address");
	    
	    Adminlogic al=new Adminlogic();
	    
	    HttpSession hs=request.getSession();
	    
	    PrintWriter pw=response.getWriter();
	    Admin status=null;
	    status=al.admin_details(aid,aname,emailid,password,phone,doj,dob,address);
		pw.println("<html><body background-image:url(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			pw.println("Manager registered successfully");
		}else {
			pw.println("Manager registration Failed");
		}
	    
	}
}
