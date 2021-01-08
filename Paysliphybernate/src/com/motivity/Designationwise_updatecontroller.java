package com.motivity;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Designationwise_updatecontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	
    	Designation ds=new Designation();
    	ds.setDeptcode(request.getParameter("deptcode"));
    	ds.setDesgcode(request.getParameter("desgcode"));
    	ds.setDesgname(request.getParameter("desgname"));
    	ds.setEid(Integer.parseInt(request.getParameter("eid")));
    	
    	
    	boolean status=false;
    	status=Designationwise_updatebean.dsgupdate(ds);
    	if(status) {
    		response.sendRedirect("designationwise.jsp?msg=Updated");
    	}
    	else
    		response.sendRedirect("designationwise.jsp?msg=failed");
    }
}
