package com.empdetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet("/Empregistration")
public class Empregistration extends HttpServlet {
	//private static final long serialVersionUID = 1L;
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
    String gender=request.getParameter("gender");
    String joiningdate=request.getParameter("joiningdate");
    String department=request.getParameter("department");
    String exp=request.getParameter("exp");
    
    PrintWriter pw=response.getWriter();
    
    String sql="insert into employee (name,email,password,gender,joiningdate,department,exp) values(?,?,?,?,?,?,?)";
    try {
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, joiningdate);
		ps.setString(6, department);
		ps.setString(7, exp);
		int x=ps.executeUpdate();
		pw.println("<html><body bgcolor='pink'><center><h1> ");
		if(x==1)
			pw.println("Employee Registered Successfully");
		pw.println("</h1></center></body></html>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
