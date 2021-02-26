package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ploginbean {
	int id;
	private String email,password,prescription;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Pregistrationbean ploginvalidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from patient where email=? and password=?");
		ps.setString(1,email);
		ps.setString(2,password);
		
		Pregistrationbean eb=new Pregistrationbean();
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			eb.setName(rs.getString(1));
			eb.setEmail(rs.getString(2));
			eb.setPassword(rs.getString(3));
			eb.setBloodgroup(rs.getString(4));
			eb.setAge(rs.getInt(5));
			eb.setPrescription(rs.getString(6));
			eb.setId(rs.getInt(7));
		return eb;
		}else {
			return null;
		}
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
}
