package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eregistrationbean {
	private String name,email,password,gender,joiningdate,department,exp;
    int id;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
	public boolean registrationvalidate(String name,String email,String password,String gender,String joiningdate,String department,String exp) throws ClassNotFoundException, SQLException {
		
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("insert into employee (name,email,password,gender,joiningdate,department,exp) values(?,?,?,?,?,?,?)");	
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, joiningdate);
		ps.setString(6, department);
		ps.setString(7, exp);
	    int x=ps.executeUpdate();
	    if(x!=0)
	    {
	    	return true;
	    }else {
	    	return false;
	    }
		
		
	}

}
