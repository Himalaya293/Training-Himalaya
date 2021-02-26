package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Gradecontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		String gradecode=request.getParameter("gradecode");
		String basic=request.getParameter("basic");
	    String hra=request.getParameter("hra");
	    String egrade=request.getParameter("egrade");
	    
	    Gradelogic gl=new Gradelogic();
	    
	    HttpSession hs=request.getSession();
	    hs.setAttribute("glogic",gl);
	    PrintWriter pw=response.getWriter();
	    Grade status=null;
	    status=gl.gdetails(eid,gradecode,basic,hra,egrade);
		pw.println("<html><body background-image:url(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			hs.setAttribute("Eid", status.getEid());
			pw.println("updated successfully");
		}else {
			pw.println("updation Failed");
		}

   }
}	
