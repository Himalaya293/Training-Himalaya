package com.empdetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Managerregistration extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement ps=null;
	
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3307/kims";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String exp=request.getParameter("exp");
	String age=request.getParameter("age");
	int Age=Integer.parseInt(age);
	String salary=request.getParameter("salary");
	String manager=request.getParameter("manager");
	
	PrintWriter pw=response.getWriter();
    String sql="insert into manager(name,email,password,exp,age,salary,manager) values(?,?,?,?,?,?,?)";
	
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,exp);
		ps.setString(5,age);
		ps.setString(6,salary);
		ps.setString(7,manager);
		
	    pw.println("<html><body bgcolor='green'><center><h1>");
	    int x=ps.executeUpdate();
	    if(x!=0)
	    {
	       pw.println("Manager Registered successfully");
	    }
		pw.println("</h1></center></body></html>");
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	}

