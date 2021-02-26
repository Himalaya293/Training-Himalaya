package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.motivity.Employeelogic;

public class Empcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid=(Integer.parseInt("eid"));
		String ename=request.getParameter("ename");
		String doj=request.getParameter("doj");
	    String dob=request.getParameter("dob");
	    String address=request.getParameter("address");
	    String deptcode=request.getParameter("deptcode");
	    String desgcode=request.getParameter("desgcode");
	    String gradecode=request.getParameter("gradecode");
	    String salary=request.getParameter("salary");
	    String pfno=request.getParameter("pfno");
	    String pfuan=request.getParameter("pfuan");
	    String casualleave=request.getParameter("casualleave");
	    String earnedleave=request.getParameter("earnedleave");
	    String sickleave=request.getParameter("sickleave");
	    
	    HttpSession session=request.getSession(true);
	    Employeelogic el=new Employeelogic();
	    Employeelogic.empdetails(eid,ename,doj,dob,address,deptcode,desgcode,gradecode,salary,pfno,pfuan,casualleave,earnedleave,sickleave);
	    response.sendRedirect("registered successfully");
	}
}
