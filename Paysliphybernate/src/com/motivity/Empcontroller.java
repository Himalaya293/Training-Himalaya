package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Empcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int eid=(Integer.parseInt(request.getParameter("eid")));
		String cname=request.getParameter("cname");
		String email=request.getParameter("email");
	    String password=request.getParameter("password");
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
	    
	    Employeelogic el=new Employeelogic();
	    
	    HttpSession hs=request.getSession();
	    hs.setAttribute("bean",el);
	    PrintWriter pw=response.getWriter();
	    Employee status=null;
	    try {
		    status=el.empdetails(eid,cname,email,password,address,deptcode,desgcode,gradecode,salary,pfno,pfuan,casualleave,earnedleave,sickleave);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    pw.println("<html><body background-image:url(Screenshot (469).png)><center><h1>");
		if(status!=null)
		{
			hs.setAttribute("eid", status.getEid());
			hs.setAttribute("cname", status.getCname());
			hs.setAttribute("deptcode", status.getDeptcode());
			hs.setAttribute("desgcode", status.getDesgcode());
			response.sendRedirect("./department.html");
		}
		pw.println("</h1></center></body></html>");
	}
}
