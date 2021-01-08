package com.motivity;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Emp_profile_updatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	
    	Employee epy=new Employee();
    	epy.setEid(Integer.parseInt(request.getParameter("eid")));
    	epy.setCname(request.getParameter("cname"));
    	epy.setEmail(request.getParameter("email"));
    	epy.setPassword(request.getParameter("password"));
    	epy.setAddress(request.getParameter("address"));
    	epy.setDeptcode(request.getParameter("deptcode"));
    	epy.setDesgcode(request.getParameter("desgcode"));
    	epy.setGradecode(request.getParameter("gradecode"));
    	epy.setSalary(request.getParameter("salary"));
    	epy.setPfno(request.getParameter("pfno"));
    	epy.setPfuan(request.getParameter("pfuan"));
    	epy.setCasualleave(request.getParameter("casualleave"));
    	epy.setEarnedleave(request.getParameter("earnedleave"));
    	epy.setSickleave(request.getParameter("sickleave"));
    	
    	boolean status=false;
    	status=Emp_profile_updatebean.update(epy);
    	if(status) {
    		response.sendRedirect("employee.jsp?msg=Updated");
    	}
    	else
    		response.sendRedirect("employee.jsp?msg=failed");
    }

}
