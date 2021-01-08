package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dedcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		String year=request.getParameter("year");
	    String month=request.getParameter("month");
	    String ename=request.getParameter("ename");
	    String deptcode=request.getParameter("deptcode");
	    String desgcode=request.getParameter("desgcode");
	    String pfamount=request.getParameter("pfamount");
	    String proftax=request.getParameter("proftax");
	    String incometax=request.getParameter("incometax");
	    
	    Deductionlogic dl=new Deductionlogic();
	    
	    HttpSession hs=request.getSession();
	    hs.setAttribute("deducts",dl);
	    PrintWriter pw=response.getWriter();
	    Deduction status=null;
	    status=dl.deductdetails(eid,year,month,ename,deptcode,desgcode,pfamount,proftax,incometax);
		pw.println("<html><body background-image:url(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			hs.setAttribute("year",year);
			hs.setAttribute("month",month);
			hs.setAttribute("pfamount",pfamount);
			hs.setAttribute("proftax",proftax);
			hs.setAttribute("incometax",incometax);
			pw.println("Employee salary Deducted successfully");
		}
	    
	}
}
