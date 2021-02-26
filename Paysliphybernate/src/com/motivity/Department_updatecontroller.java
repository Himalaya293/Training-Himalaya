package com.motivity;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Department_updatecontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	
    	Department d=new Department();
    	d.setDeptcode(request.getParameter("deptcode"));
    	d.setDeptname(request.getParameter("deptname"));
    	d.setEid(Integer.parseInt(request.getParameter("eid")));
    	
    	boolean status=false;
    	status=Department_updatebean.dupdate(d);
    	if(status) {
    		response.sendRedirect("departmentwise.jsp?msg=Updated");
    	}
    	else
    		response.sendRedirect("departmentwise.jsp?msg=failed");
    }
}
