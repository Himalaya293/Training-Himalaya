package com.kims;

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


public class DoctorRegistration extends HttpServlet {
    Connection con=null;
    PreparedStatement ps=null;
    
    public void init(ServletConfig config) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
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
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {response.getWriter().append("Served at: ").append(request.getContextPath());
	
	        String name=request.getParameter("name");
	        String password=request.getParameter("password");
	        String email=request.getParameter("email");
	        String phone=request.getParameter("phone");
	        long mobile=Long.parseLong(phone);
	        String specialiazation=request.getParameter("specialiazation");
	        
	        PrintWriter pw=response.getWriter();
	        
	        String sql="insert into doctor(name,password,email,phone,specialiazation) values(?,?,?,?,?)";
	        try {
				ps=con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, password);
				ps.setString(3, email);
				ps.setLong(4, mobile);
				ps.setString(5, specialiazation);
				pw.println("<html> <body bgcolor='wheat'><center><h1>");
			    int x=ps.executeUpdate();
			    if(x!=0)
			    	pw.println("Docter Registered successfully");
			    pw.println("</h1></center></body></html>");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
