package com.mvcapollo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pregistrationbean {
	
    private String name,email,password,bloodgroup,prescription;
    private int id,age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PreparedStatement pregistrationvalidate(String name,String email,String password,String bloodgroup,int age,String prescription) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("insert into patient (name,email,password,bloodgroup,age,prescription) values(?,?,?,?,?,?)");	
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3,password);
		ps.setString(4,bloodgroup);
		ps.setInt(5,age);
		ps.setString(6,prescription);
	    int x=ps.executeUpdate();
	    if(x!=0)
	    {
	    	return ps;
	    }else {
	    	return null;
	    }
		
		
	}
}
