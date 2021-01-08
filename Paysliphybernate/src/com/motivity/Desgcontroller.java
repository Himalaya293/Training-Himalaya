package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Desgcontroller extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs=request.getSession();
		int eid=(int)hs.getAttribute("eid");
		String deptcode=(String)hs.getAttribute("deptcode");
		String desgcode=(String)hs.getAttribute("desgcode");
	    String desgname=request.getParameter("desgname");
	    
	    Designationlogic dg=new Designationlogic();
	    
	    
	    hs.setAttribute("desig",dg);
	    PrintWriter pw=response.getWriter();
	    Designation status=null;
	    status=dg.desgdetails(eid,deptcode,desgcode,desgname);
		pw.println("<html><body background=(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			pw.println("updated successfully");
		}else {
			pw.println("updation Failed");
		}

 }
}