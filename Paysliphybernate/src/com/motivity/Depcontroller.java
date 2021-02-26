package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Depcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs=request.getSession();
		int eid=(int)hs.getAttribute("eid");
		String deptcode=(String)hs.getAttribute("deptcode");
	    String deptname=request.getParameter("deptname");
	    
	    Departmentlogic dp=new Departmentlogic();
	    
	    hs.setAttribute("department",dp);
	    PrintWriter pw=response.getWriter();
	    Department status=null;
	    status=dp.depdetails(eid,deptcode,deptname);
		pw.println("<html><body background=(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			response.sendRedirect("./designation.html");
		}else {
			pw.println("updation Failed");
		}
	}
}
