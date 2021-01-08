package com.motivity;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Grade_updatecontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	
    	Grade g=new Grade();
    	String gradecode=request.getParameter("gradecode");
		String basic=request.getParameter("basic");
	    String hra=request.getParameter("hra");
	    String egrade=request.getParameter("egrade");
    	
    	
    	boolean status=false;
		status=Grade_updatebean.gupdate(gradecode,basic,hra,egrade);
    	if(status) {
    		response.sendRedirect("grade.jsp?msg=Updated");
    	}
    	else
    		response.sendRedirect("grade.jsp?msg=failed");
    }
}
