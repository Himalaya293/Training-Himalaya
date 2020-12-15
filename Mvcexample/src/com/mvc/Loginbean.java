package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loginbean {
	private String email,password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
public Registrationbean loginvalidate(String email,String password) throws ClassNotFoundException, SQLException {
	Connection con=ConnectionEx.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * from manager where email=? and password=?");
	ps.setString(1,email);
	ps.setString(2,password);
	
	ResultSet rs=ps.executeQuery();
	
	Registrationbean rb=new Registrationbean();
	if(rs.next())
	{
		rb.setId(rs.getInt(1));
		rb.setName(rs.getString(2));
		rb.setEmail(rs.getString(3));
		rb.setPassword(rs.getString(4));
		rb.setExp(rs.getString(5));
		rb.setAge(rs.getInt(6));
		rb.setSalary(rs.getString(7));
		rb.setManager(rs.getString(8));
	
	    return rb;
	}else {
		return null;
	}
}
}